package server.endpoints;

import server.webservices.EstateAgentWebServiceImpl;

import javax.xml.ws.Endpoint;

public class EstateAgentWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8095/wss/estateagent", new EstateAgentWebServiceImpl());
    }
}
