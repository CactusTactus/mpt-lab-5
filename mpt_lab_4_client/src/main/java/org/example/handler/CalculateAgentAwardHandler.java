//package org.example.handler;
//
//import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
//import org.camunda.bpm.client.task.ExternalTask;
//import org.camunda.bpm.client.task.ExternalTaskHandler;
//import org.camunda.bpm.client.task.ExternalTaskService;
//import org.example.RestClientApplication;
//import org.example.entity.EstateAgentAward;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//@Component
//@ExternalTaskSubscription("calculate-agent-award")
//public class CalculateAgentAwardHandler implements ExternalTaskHandler {
//
//    @Autowired
//    RestTemplateBuilder restTemplateBuilder;
//
//    public RestTemplate getRestTemplate() {
//        return restTemplateBuilder.build();
//    }
//
//    @Override
//    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
//        org.slf4j.Logger log = LoggerFactory.getLogger(RestClientApplication.class);
//
//        log.info("STARTED");
//
//        Integer estateAgentId = externalTask.getVariable("estateAgentId");
//
//        calculateEstateAgentAward(getRestTemplate(), estateAgentId);
//
//        externalTaskService.complete(externalTask);
//
//        log.info("COMPLETED with estateAgentId: " + estateAgentId);
//    }
//
//    public void calculateEstateAgentAward(RestTemplate restTemplate, Integer estateAgentId) {
//        restTemplate.getForObject("http://localhost:8087/agent-award/" + estateAgentId, EstateAgentAward.class);
//    }
//}