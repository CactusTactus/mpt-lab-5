package webservice;


import com.example.client.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class EstateTransactionClient extends WebServiceGatewaySupport {

    public GetEstateTransactionsByEstateAgentIdResponse getEstateTransactionsByEstateAgentId(Integer estateAgentId) {
        GetEstateTransactionsByEstateAgentIdRequest request = new GetEstateTransactionsByEstateAgentIdRequest();
        request.setEstateAgentId(estateAgentId);

        return (GetEstateTransactionsByEstateAgentIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://localhost:8092/ws/",
                request,
                new SoapActionCallback("http://example.com/spring-boot-soap-example/getEstateTransactionsByEstateAgentIdRequest")
        );
    }

    public void createEstateTransaction(
            Integer apartmentCost,
            Integer apartmentArea,
            Long transactionDate,
            Integer estateAgentId
    ) {
        EstateTransaction estateTransaction = getEstateTransaction(apartmentCost, apartmentArea, transactionDate, estateAgentId);
        CreateEstateTransactionRequest request = new CreateEstateTransactionRequest();
        request.setEstateTransaction(estateTransaction);
        getWebServiceTemplate()
                .marshalSendAndReceive(request);
    }

    private EstateTransaction getEstateTransaction(
            Integer apartmentCost,
            Integer apartmentArea,
            Long transactionDate,
            Integer estateAgentId
    ) {
        EstateTransaction estateTransaction = new EstateTransaction();

        estateTransaction.setEstateTransactionId(0);
        estateTransaction.setApartmentCost(apartmentCost);
        estateTransaction.setApartmentArea(apartmentArea);
        estateTransaction.setTransactionDate(transactionDate);
        estateTransaction.setEstateAgentId(estateAgentId);

        return estateTransaction;
    }
}