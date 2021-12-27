package com.example.webservice.endpoint;

import com.example.spring_boot_soap_example.*;
import com.example.webservice.service.EstateTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

// https://spring.io/guides/gs/producing-web-service/
// https://www.baeldung.com/spring-boot-soap-web-service
@Endpoint
public class EstateTransactionEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/spring-boot-soap-example";

    @Autowired
    EstateTransactionService estateTransactionService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEstateTransactionsByEstateAgentIdRequest")
    @ResponsePayload
    public GetEstateTransactionsByEstateAgentIdResponse getEstateTransactionsByEstateAgentId(@RequestPayload GetEstateTransactionsByEstateAgentIdRequest request) {
        GetEstateTransactionsByEstateAgentIdResponse response = new GetEstateTransactionsByEstateAgentIdResponse();
        Integer estateAgentId = request.getEstateAgentId();
        List<EstateTransaction> estateTransactions = estateTransactionService.findAllByEstateAgentId(estateAgentId);
        response.getEstateTransactions().addAll(estateTransactions);
        return response;
    }
}
