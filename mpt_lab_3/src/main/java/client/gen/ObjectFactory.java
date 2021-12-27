
package client.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEstateAgentsResponse_QNAME = new QName("http://webservices.server/", "getEstateAgentsResponse");
    private final static QName _GetEstateAgents_QNAME = new QName("http://webservices.server/", "getEstateAgents");
    private final static QName _GetEstateAgentByIdResponse_QNAME = new QName("http://webservices.server/", "getEstateAgentByIdResponse");
    private final static QName _GetEstateAgentById_QNAME = new QName("http://webservices.server/", "getEstateAgentById");
    private final static QName _EstateAgent_QNAME = new QName("http://webservices.server/", "estateAgent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstateAgent }
     * 
     */
    public EstateAgent createEstateAgent() {
        return new EstateAgent();
    }

    /**
     * Create an instance of {@link GetEstateAgentById }
     * 
     */
    public GetEstateAgentById createGetEstateAgentById() {
        return new GetEstateAgentById();
    }

    /**
     * Create an instance of {@link GetEstateAgentsResponse }
     * 
     */
    public GetEstateAgentsResponse createGetEstateAgentsResponse() {
        return new GetEstateAgentsResponse();
    }

    /**
     * Create an instance of {@link GetEstateAgentByIdResponse }
     * 
     */
    public GetEstateAgentByIdResponse createGetEstateAgentByIdResponse() {
        return new GetEstateAgentByIdResponse();
    }

    /**
     * Create an instance of {@link GetEstateAgents }
     * 
     */
    public GetEstateAgents createGetEstateAgents() {
        return new GetEstateAgents();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstateAgentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.server/", name = "getEstateAgentsResponse")
    public JAXBElement<GetEstateAgentsResponse> createGetEstateAgentsResponse(GetEstateAgentsResponse value) {
        return new JAXBElement<GetEstateAgentsResponse>(_GetEstateAgentsResponse_QNAME, GetEstateAgentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstateAgents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.server/", name = "getEstateAgents")
    public JAXBElement<GetEstateAgents> createGetEstateAgents(GetEstateAgents value) {
        return new JAXBElement<GetEstateAgents>(_GetEstateAgents_QNAME, GetEstateAgents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstateAgentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.server/", name = "getEstateAgentByIdResponse")
    public JAXBElement<GetEstateAgentByIdResponse> createGetEstateAgentByIdResponse(GetEstateAgentByIdResponse value) {
        return new JAXBElement<GetEstateAgentByIdResponse>(_GetEstateAgentByIdResponse_QNAME, GetEstateAgentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstateAgentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.server/", name = "getEstateAgentById")
    public JAXBElement<GetEstateAgentById> createGetEstateAgentById(GetEstateAgentById value) {
        return new JAXBElement<GetEstateAgentById>(_GetEstateAgentById_QNAME, GetEstateAgentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstateAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.server/", name = "estateAgent")
    public JAXBElement<EstateAgent> createEstateAgent(EstateAgent value) {
        return new JAXBElement<EstateAgent>(_EstateAgent_QNAME, EstateAgent.class, null, value);
    }

}
