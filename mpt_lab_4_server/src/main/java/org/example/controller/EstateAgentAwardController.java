package org.example.controller;


import org.example.entity.EstateAgent;
import org.example.entity.EstateAgentAward;
import org.example.service.EstateAgentAwardService;
import org.example.service.EstateAgentService;
import org.example.util.EstateAgentAwardCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController()
public class EstateAgentAwardController {

    @Autowired
    EstateAgentService estateAgentService;

    @Autowired
    EstateAgentAwardService estateAgentAwardService;

    @GetMapping("/agent-award/{id}")
    public ResponseEntity<EstateAgentAward> estateAgentAward(@PathVariable(name = "id") Integer estateAgentId) {
        EstateAgent estateAgent = estateAgentService.findByEstateAgentId(estateAgentId);
        EstateAgentAward estateAgentAward = EstateAgentAwardCalculator.getAgentAward(estateAgent);
        estateAgentAwardService.saveEstateAgentAward(estateAgentAward);
        return new ResponseEntity<>(estateAgentAward, HttpStatus.OK);
    }

    @GetMapping("/agent-awards")
    public ResponseEntity<Iterable<EstateAgentAward>> estateAgentAwards() {
        List<EstateAgent> estateAgents = estateAgentService.findAll();
        List<EstateAgentAward> estateAgentAwards = new ArrayList<>();
        for (EstateAgent estateAgent: estateAgents) {
            estateAgentAwards.add(EstateAgentAwardCalculator.getAgentAward(estateAgent));
        }
        return new ResponseEntity<>(estateAgentAwards, HttpStatus.OK);
    }
}