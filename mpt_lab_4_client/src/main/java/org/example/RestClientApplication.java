package org.example;

import org.camunda.bpm.client.ExternalTaskClient;
import org.example.entity.EstateAgentAward;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            ExternalTaskClient client = ExternalTaskClient.create()
                    .baseUrl("http://localhost:8080/engine-rest")
                    .asyncResponseTimeout(10000)
                    .build();

            client.subscribe("calculate-agent-award")
                    .lockDuration(5000)
                    .handler((externalTask, externalTaskService) -> {
                        Integer estateAgentId = externalTask.getVariable("estateAgentId");
                        restTemplate.getForObject("http://localhost:8087/agent-award/" + estateAgentId, EstateAgentAward.class);
                        externalTaskService.complete(externalTask);
                    })
                    .open();
        };
    }
}
