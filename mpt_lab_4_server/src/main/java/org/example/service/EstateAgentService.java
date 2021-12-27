package org.example.service;

import org.example.entity.EstateAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.EstateAgentRepository;

import java.util.List;

@Service
public class EstateAgentService {

    @Autowired
    EstateAgentRepository estateAgentRepository;

    public EstateAgent findByEstateAgentId(Integer estateAgentId) {
        return estateAgentRepository.findByEstateAgentId(estateAgentId);
    }

    public List<EstateAgent> findAll() {
        return estateAgentRepository.findAll();
    }
}
