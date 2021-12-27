package server.webservices;

import server.entities.EstateAgent;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface EstateAgentWebService {

    @WebMethod
    List<EstateAgent> getEstateAgents();

    @WebMethod
    EstateAgent getEstateAgentById(@WebParam(name = "estateAgentId") Integer estateAgentId);
}
