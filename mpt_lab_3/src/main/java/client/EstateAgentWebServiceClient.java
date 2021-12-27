package client;

import client.gen.EstateAgent;
import client.gen.EstateAgentWebService;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstateAgentWebServiceClient {
    private static void getEstateAgents(EstateAgentWebService estateAgentWebService) {
        List<EstateAgent> estateAgents = estateAgentWebService.getEstateAgents();
        printEstateAgentsInfo(estateAgents);
    }

    private static void getEstateAgentById(EstateAgentWebService estateAgentWebService, Integer estateAgentId) {
        EstateAgent estateAgent = estateAgentWebService.getEstateAgentById(estateAgentId);
        System.out.println(estateAgent);
    }

    private static void printEstateAgentsInfo(List<EstateAgent> estateAgents) {
        estateAgents.forEach(agent -> {
            System.out.println(agent.getId() + " " + agent.getName() + " " + agent.getSalary() + " " + agent.isActive());
        });
    }

    public static void main(String[] args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000)
                .build();

        client.subscribe("get-agent")
                .lockDuration(5000)
                .handler((externalTask, externalTaskService) -> {
                    int estateAgentId = 9; // agent with id = 6 is active, agent with id = 9 is not
                    try {
                        URL url = new URL("http://localhost:8095/wss/estateagent?wsdl");
                        QName qname = new QName("http://webservices.server/", "EstateAgentWebServiceImplService");
                        Service service = Service.create(url, qname);
                        EstateAgentWebService estateAgentWebService = service.getPort(EstateAgentWebService.class);

                        EstateAgent estateAgent = estateAgentWebService.getEstateAgentById(estateAgentId);
                        estateAgentId = estateAgent.isActive() ? estateAgent.getId() : -1;
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    VariableMap variableMap = Variables.createVariables();
                    variableMap.put("estateAgentId", estateAgentId);
                    externalTaskService.complete(externalTask, variableMap);

                    Logger.getLogger("get-agent").log(Level.INFO, "estateAgentId: "  + estateAgentId);
                })
                .open();
    }
}
