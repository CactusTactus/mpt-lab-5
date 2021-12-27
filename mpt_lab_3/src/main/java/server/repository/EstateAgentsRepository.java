package server.repository;

import server.entities.EstateAgent;
import server.utils.DatabaseHelper;

import java.util.List;

public class EstateAgentsRepository {
    public List<EstateAgent> getEstateAgents() {
        return DatabaseHelper.getEstateAgents();
    }

    public EstateAgent getEstateAgentById(int estateAgentId) {
        return DatabaseHelper.getEstateAgentById(estateAgentId);
    }
}
