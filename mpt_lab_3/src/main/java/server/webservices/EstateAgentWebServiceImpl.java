package server.webservices;

import server.entities.EstateAgent;
import server.repository.EstateAgentsRepository;

import javax.jws.WebService;
import java.util.List;

// from src/main/java
// wsimport -keep -p client.gen -b ../resources/bindings.xml http://localhost:8095/wss/estateagent?wsdl
@WebService(endpointInterface = "server.webservices.EstateAgentWebService")
public class EstateAgentWebServiceImpl implements EstateAgentWebService {

    private final EstateAgentsRepository estateAgentsRepository = new EstateAgentsRepository();

    @Override
    public List<EstateAgent> getEstateAgents() {
        System.out.println("getEstateAgents");
        return estateAgentsRepository.getEstateAgents();
    }

    @Override
    public EstateAgent getEstateAgentById(Integer estateAgentId) {
        return estateAgentsRepository.getEstateAgentById(estateAgentId);
    }
}
