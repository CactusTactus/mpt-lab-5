//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.19 at 08:08:38 PM MSK 
//


package com.example.client.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estate_agent_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estateAgentId"
})
@XmlRootElement(name = "getEstateTransactionsByEstateAgentIdRequest")
public class GetEstateTransactionsByEstateAgentIdRequest {

    @XmlElement(name = "estate_agent_id")
    protected int estateAgentId;

    /**
     * Gets the value of the estateAgentId property.
     * 
     */
    public int getEstateAgentId() {
        return estateAgentId;
    }

    /**
     * Sets the value of the estateAgentId property.
     * 
     */
    public void setEstateAgentId(int value) {
        this.estateAgentId = value;
    }

}
