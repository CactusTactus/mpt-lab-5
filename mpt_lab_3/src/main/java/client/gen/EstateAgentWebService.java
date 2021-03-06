
package client.gen;

import java.util.List;
import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstateAgentWebService", targetNamespace = "http://webservices.server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstateAgentWebService {


    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<client.gen.GetEstateAgentsResponse>
     */
    @WebMethod(operationName = "getEstateAgents")
    @RequestWrapper(localName = "getEstateAgents", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgents")
    @ResponseWrapper(localName = "getEstateAgentsResponse", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentsResponse")
    public Response<GetEstateAgentsResponse> getEstateAgentsAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getEstateAgents")
    @RequestWrapper(localName = "getEstateAgents", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgents")
    @ResponseWrapper(localName = "getEstateAgentsResponse", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentsResponse")
    public Future<?> getEstateAgentsAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetEstateAgentsResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns java.util.List<client.gen.EstateAgent>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEstateAgents", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgents")
    @ResponseWrapper(localName = "getEstateAgentsResponse", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentsResponse")
    @Action(input = "http://webservices.server/EstateAgentWebService/getEstateAgentsRequest", output = "http://webservices.server/EstateAgentWebService/getEstateAgentsResponse")
    public List<EstateAgent> getEstateAgents();

    /**
     * 
     * @param estateAgentId
     * @return
     *     returns javax.xml.ws.Response<client.gen.GetEstateAgentByIdResponse>
     */
    @WebMethod(operationName = "getEstateAgentById")
    @RequestWrapper(localName = "getEstateAgentById", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentById")
    @ResponseWrapper(localName = "getEstateAgentByIdResponse", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentByIdResponse")
    public Response<GetEstateAgentByIdResponse> getEstateAgentByIdAsync(
        @WebParam(name = "estateAgentId", targetNamespace = "")
        Integer estateAgentId);

    /**
     * 
     * @param estateAgentId
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getEstateAgentById")
    @RequestWrapper(localName = "getEstateAgentById", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentById")
    @ResponseWrapper(localName = "getEstateAgentByIdResponse", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentByIdResponse")
    public Future<?> getEstateAgentByIdAsync(
        @WebParam(name = "estateAgentId", targetNamespace = "")
        Integer estateAgentId,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetEstateAgentByIdResponse> asyncHandler);

    /**
     * 
     * @param estateAgentId
     * @return
     *     returns client.gen.EstateAgent
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEstateAgentById", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentById")
    @ResponseWrapper(localName = "getEstateAgentByIdResponse", targetNamespace = "http://webservices.server/", className = "client.gen.GetEstateAgentByIdResponse")
    @Action(input = "http://webservices.server/EstateAgentWebService/getEstateAgentByIdRequest", output = "http://webservices.server/EstateAgentWebService/getEstateAgentByIdResponse")
    public EstateAgent getEstateAgentById(
        @WebParam(name = "estateAgentId", targetNamespace = "")
        Integer estateAgentId);

}
