package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstateAgentAward {

    private Integer estateAgentId;
    private String estateAgentName;
    private Integer estateAgentAward;

    public EstateAgentAward(Integer estateAgentId, String estateAgentName, Integer estateAgentAward) {
        this.estateAgentId = estateAgentId;
        this.estateAgentName = estateAgentName;
        this.estateAgentAward = estateAgentAward;
    }

    public Integer getEstateAgentId() {
        return estateAgentId;
    }

    public void setEstateAgentId(Integer estateAgentId) {
        this.estateAgentId = estateAgentId;
    }

    public String getEstateAgentName() {
        return estateAgentName;
    }

    public void setEstateAgentName(String estateAgentName) {
        this.estateAgentName = estateAgentName;
    }

    public Integer getEstateAgentAward() {
        return estateAgentAward;
    }

    public void setEstateAgentAward(Integer estateAgentAward) {
        this.estateAgentAward = estateAgentAward;
    }

    @Override
    public String toString() {
        return "EstateAgentAward{" +
                "estateAgentId=" + estateAgentId +
                ", estateAgentName='" + estateAgentName + '\'' +
                ", estateAgentAward=" + estateAgentAward +
                '}';
    }
}
