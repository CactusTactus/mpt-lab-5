package org.example.repository;

import org.example.entity.EstateAgentAward;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateAgentAwardRepository extends CrudRepository<EstateAgentAward, Integer> {}