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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estate_transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estate_transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estate_transaction_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="apartment_cost" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="apartment_area" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transaction_date" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "estate_transaction", propOrder = {
    "estateTransactionId",
    "apartmentCost",
    "apartmentArea",
    "transactionDate",
    "estateAgentId"
})
public class EstateTransaction {

    @XmlElement(name = "estate_transaction_id")
    protected int estateTransactionId;
    @XmlElement(name = "apartment_cost")
    protected int apartmentCost;
    @XmlElement(name = "apartment_area")
    protected int apartmentArea;
    @XmlElement(name = "transaction_date")
    protected long transactionDate;
    @XmlElement(name = "estate_agent_id")
    protected int estateAgentId;

    /**
     * Gets the value of the estateTransactionId property.
     * 
     */
    public int getEstateTransactionId() {
        return estateTransactionId;
    }

    /**
     * Sets the value of the estateTransactionId property.
     * 
     */
    public void setEstateTransactionId(int value) {
        this.estateTransactionId = value;
    }

    /**
     * Gets the value of the apartmentCost property.
     * 
     */
    public int getApartmentCost() {
        return apartmentCost;
    }

    /**
     * Sets the value of the apartmentCost property.
     * 
     */
    public void setApartmentCost(int value) {
        this.apartmentCost = value;
    }

    /**
     * Gets the value of the apartmentArea property.
     * 
     */
    public int getApartmentArea() {
        return apartmentArea;
    }

    /**
     * Sets the value of the apartmentArea property.
     * 
     */
    public void setApartmentArea(int value) {
        this.apartmentArea = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     */
    public long getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     */
    public void setTransactionDate(long value) {
        this.transactionDate = value;
    }

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
