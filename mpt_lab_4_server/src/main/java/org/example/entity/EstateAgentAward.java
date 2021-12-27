package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name="estate_agent_award")
public class EstateAgentAward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estate_agent_award_id")
    private Integer estateAgentAwardId;

    @Column(name = "estate_agent_id")
    private Integer estateAgentId;

    @Column(name = "estate_agent_name")
    private String estateAgentName;

    @Column(name = "estate_agent_award")
    private Integer estateAgentAward;

    public EstateAgentAward() {}

    public EstateAgentAward(Integer estateAgentId, String estateAgentName, Integer estateAgentAward) {
        this.estateAgentId = estateAgentId;
        this.estateAgentName = estateAgentName;
        this.estateAgentAward = estateAgentAward;
    }

    public Integer getEstateAgentAwardId() {
        return estateAgentAwardId;
    }

    public void setEstateAgentAwardId(Integer estateAgentAwardId) {
        this.estateAgentAwardId = estateAgentAwardId;
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
}
