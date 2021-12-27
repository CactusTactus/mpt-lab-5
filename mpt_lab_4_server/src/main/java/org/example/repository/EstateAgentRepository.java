package org.example.repository;

import org.example.entity.EstateAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateAgentRepository extends JpaRepository<EstateAgent, Integer> {

    EstateAgent findByEstateAgentId(Integer estateAgentId);
}