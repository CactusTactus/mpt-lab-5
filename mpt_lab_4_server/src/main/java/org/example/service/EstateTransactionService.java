package org.example.service;

import org.example.entity.EstateAgent;
import org.example.entity.EstateTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.EstateTransactionRepository;

import java.util.List;

@Service
public class EstateTransactionService {

    @Autowired
    EstateTransactionRepository estateTransactionRepository;

    public List<EstateTransaction> findAllByEstateAgent(EstateAgent estateAgent) {
        return estateTransactionRepository.findAllByEstateAgent(estateAgent);
    }

    public List<EstateTransaction> findAll() {
        return estateTransactionRepository.findAll();
    }
}
