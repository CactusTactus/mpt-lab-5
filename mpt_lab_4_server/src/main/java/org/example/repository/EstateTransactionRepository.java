package org.example.repository;

import org.example.entity.EstateAgent;
import org.example.entity.EstateTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstateTransactionRepository extends JpaRepository<EstateTransaction, Integer> {

    List<EstateTransaction> findAllByEstateAgent(EstateAgent estateAgent);
}
