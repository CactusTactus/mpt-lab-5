package webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import webservice.EstateTransactionClient;

@Configuration
public class EstateTransactionClientConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.client.wsdl");
        return marshaller;
    }

    @Bean
    public EstateTransactionClient estateTransactionClient(Jaxb2Marshaller marshaller) {
        EstateTransactionClient client = new EstateTransactionClient();
        client.setDefaultUri("http://localhost:8092/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
