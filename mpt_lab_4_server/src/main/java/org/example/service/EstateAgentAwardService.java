package org.example.service;

import org.example.entity.EstateAgentAward;
import org.example.repository.EstateAgentAwardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstateAgentAwardService {

    @Autowired
    EstateAgentAwardRepository estateAgentAwardRepository;

    public void saveEstateAgentAward(EstateAgentAward estateAgentAward) {
        estateAgentAwardRepository.save(estateAgentAward);
    }
}
