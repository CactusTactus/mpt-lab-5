//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.19 at 07:27:00 PM MSK 
//


package com.example.spring_boot_soap_example;

import javax.persistence.*;
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
@Entity
@Table(name = "estate_transaction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estate_transaction", propOrder = {
        "estateTransactionId",
        "apartmentCost",
        "apartmentArea",
        "transactionDate",
        "estateAgentId"
})
public class EstateTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estate_transaction_id")
    @XmlElement(name = "estate_transaction_id")
    protected Integer estateTransactionId;

    @Column(name = "apartment_cost")
    @XmlElement(name = "apartment_cost")
    protected Integer apartmentCost;

    @Column(name = "apartment_area")
    @XmlElement(name = "apartment_area")
    protected Integer apartmentArea;

    @Column(name = "estate_transaction_date")
    @XmlElement(name = "transaction_date")
    protected Long transactionDate;

    @Column(name = "estate_agent_id")
    @XmlElement(name = "estate_agent_id")
    protected Integer estateAgentId;

    /**
     * Gets the value of the estateTransactionId property.
     * 
     */
    public Integer getEstateTransactionId() {
        return estateTransactionId;
    }

    /**
     * Sets the value of the estateTransactionId property.
     * 
     */
    public void setEstateTransactionId(Integer value) {
        this.estateTransactionId = value;
    }

    /**
     * Gets the value of the apartmentCost property.
     * 
     */
    public Integer getApartmentCost() {
        return apartmentCost;
    }

    /**
     * Sets the value of the apartmentCost property.
     * 
     */
    public void setApartmentCost(Integer value) {
        this.apartmentCost = value;
    }

    /**
     * Gets the value of the apartmentArea property.
     * 
     */
    public Integer getApartmentArea() {
        return apartmentArea;
    }

    /**
     * Sets the value of the apartmentArea property.
     * 
     */
    public void setApartmentArea(Integer value) {
        this.apartmentArea = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     */
    public Long getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     */
    public void setTransactionDate(Long value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the estateAgentId property.
     * 
     */
    public Integer getEstateAgentId() {
        return estateAgentId;
    }

    /**
     * Sets the value of the estateAgentId property.
     * 
     */
    public void setEstateAgentId(Integer value) {
        this.estateAgentId = value;
    }

}
