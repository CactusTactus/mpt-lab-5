package com.example.webservice.repository;

import com.example.spring_boot_soap_example.EstateTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstateTransactionRepository extends JpaRepository<EstateTransaction, Integer> {

    List<EstateTransaction> findAllByEstateAgentId(Integer estateAgentId);

}
