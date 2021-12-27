package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "estate_transaction")
public class EstateTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estate_transaction_id")
    protected Integer estateTransactionId;

    @Column(name = "apartment_cost", nullable = false)
    protected Integer apartmentCost;

    @Column(name = "apartment_area", nullable = false)
    protected Integer apartmentArea;

    @Column(name = "estate_transaction_date", nullable = false)
    protected Long transactionDate;

    @ManyToOne
    @JoinColumn(name = "estate_agent_id", nullable = false)
    private EstateAgent estateAgent;

    public EstateTransaction() {}

    public EstateTransaction(Integer estateTransactionId, Integer apartmentCost, Integer apartmentArea, Long transactionDate, EstateAgent estateAgent) {
        this.estateTransactionId = estateTransactionId;
        this.apartmentCost = apartmentCost;
        this.apartmentArea = apartmentArea;
        this.transactionDate = transactionDate;
        this.estateAgent = estateAgent;
    }

    public Integer getEstateTransactionId() {
        return estateTransactionId;
    }

    public void setEstateTransactionId(Integer estateTransactionId) {
        this.estateTransactionId = estateTransactionId;
    }

    public Integer getApartmentCost() {
        return apartmentCost;
    }

    public void setApartmentCost(Integer apartmentCost) {
        this.apartmentCost = apartmentCost;
    }

    public Integer getApartmentArea() {
        return apartmentArea;
    }

    public void setApartmentArea(Integer apartmentArea) {
        this.apartmentArea = apartmentArea;
    }

    public Long getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Long transactionDate) {
        this.transactionDate = transactionDate;
    }

    public EstateAgent getEstateAgent() {
        return estateAgent;
    }

    public void setEstateAgent(EstateAgent estateAgent) {
        this.estateAgent = estateAgent;
    }

    @Override
    public String toString() {
        return "EstateTransaction{" +
                "estateTransactionId=" + estateTransactionId +
                ", apartmentCost=" + apartmentCost +
                ", apartmentArea=" + apartmentArea +
                ", transactionDate=" + transactionDate +
                ", estateAgent=" + estateAgent +
                '}';
    }
}