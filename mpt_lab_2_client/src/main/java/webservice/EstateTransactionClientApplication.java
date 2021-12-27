package webservice;

import com.example.client.wsdl.EstateTransaction;
import com.example.client.wsdl.GetEstateTransactionsByEstateAgentIdResponse;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EstateTransactionClientApplication {
    @Autowired
    EstateTransactionClient estateTransactionClient;

    public static void main(String[] args) {
        SpringApplication.run(EstateTransactionClientApplication.class, args);
    }


    @Bean
    public CommandLineRunner run() {
        return args -> {
            ExternalTaskClient client = ExternalTaskClient.create()
                    .baseUrl("http://localhost:8080/engine-rest")
                    .asyncResponseTimeout(10000)
                    .build();

            client.subscribe("get-agent-transactions")
                    .lockDuration(5000)
                    .handler((externalTask, externalTaskService) -> {
                        Integer estateAgentId = externalTask.getVariable("estateAgentId");

                        GetEstateTransactionsByEstateAgentIdResponse response = estateTransactionClient.getEstateTransactionsByEstateAgentId(estateAgentId);
                        List<EstateTransaction> transactions = response.getEstateTransactions();
                        estateAgentId = transactions.size() > 0 ? estateAgentId : -1;

                        VariableMap variableMap = Variables.createVariables();
                        variableMap.put("estateAgentId", estateAgentId);
                        externalTaskService.complete(externalTask, variableMap);
                    })
                    .open();
        };
    }
}
