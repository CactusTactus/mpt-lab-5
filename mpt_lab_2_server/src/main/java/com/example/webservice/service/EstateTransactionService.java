package com.example.webservice.service;

import com.example.spring_boot_soap_example.EstateTransaction;
import com.example.webservice.repository.EstateTransactionRepository;
import com.example.webservice.util.UnixTimeHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstateTransactionService {

    @Autowired
    EstateTransactionRepository estateTransactionRepository;

    public List<EstateTransaction> findAllByEstateAgentId(Integer estateAgentId) {
        return estateTransactionRepository.findAllByEstateAgentId(estateAgentId).stream()
                .filter(et ->
                        et.getTransactionDate() * 1000 >= UnixTimeHelper.getStartOfCurrentMonthMillis() &&
                        et.getTransactionDate() * 1000 <= UnixTimeHelper.getEndOfCurrentMonthMillis())
                .collect(Collectors.toList());
    }

    public List<EstateTransaction> findAll() {
        return estateTransactionRepository.findAll();
    }
}
