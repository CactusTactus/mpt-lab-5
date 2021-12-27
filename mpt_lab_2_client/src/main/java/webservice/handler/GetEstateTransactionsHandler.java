//package webservice.handler;
//
//import com.example.client.wsdl.EstateTransaction;
//import com.example.client.wsdl.GetEstateTransactionsByEstateAgentIdResponse;
//import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
//import org.camunda.bpm.client.task.ExternalTask;
//import org.camunda.bpm.client.task.ExternalTaskHandler;
//import org.camunda.bpm.client.task.ExternalTaskService;
//import org.camunda.bpm.engine.variable.VariableMap;
//import org.camunda.bpm.engine.variable.Variables;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import webservice.EstateTransactionClient;
//import webservice.EstateTransactionClientApplication;
//
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//@Component
//@ExternalTaskSubscription("get-agent-transactions")
//public class GetEstateTransactionsHandler implements ExternalTaskHandler {
//
//    @Autowired
//    EstateTransactionClient client;
//
//    @Override
//    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
//
//        org.slf4j.Logger log = LoggerFactory.getLogger(EstateTransactionClientApplication.class);
//
//        log.info("STARTED");
//
//        Integer estateAgentId = externalTask.getVariable("estateAgentId");
//
//        GetEstateTransactionsByEstateAgentIdResponse response = client.getEstateTransactionsByEstateAgentId(estateAgentId);
//        List<EstateTransaction> transactions =  response.getEstateTransactions();
//        estateAgentId = transactions.size() > 0 ? estateAgentId : -1;
//
//        VariableMap variableMap = Variables.createVariables();
//        variableMap.put("estateAgentId", estateAgentId);
//
//        externalTaskService.complete(externalTask, variableMap);
//
//        log.info("COMPLETED with estateAgentId: " + estateAgentId);
//    }
//}
