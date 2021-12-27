package org.example.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estate_agent")
public class EstateAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estate_agent_id")
    protected Integer estateAgentId;

    @Column(name = "name", nullable = false)
    protected String name;

    @Column(name = "salary", nullable = false)
    protected Integer salary;

    @Column(name ="is_active", nullable = false, columnDefinition = "TINYINT(1)")
    protected Boolean isActive;

    @OneToMany(mappedBy = "estateAgent", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<EstateTransaction> estateTransactions = new HashSet<>();

    public EstateAgent() {}

    public EstateAgent(Integer estateAgentId, String name, Integer salary, Boolean isActive, Set<EstateTransaction> estateTransactions) {
        this.estateAgentId = estateAgentId;
        this.name = name;
        this.salary = salary;
        this.isActive = isActive;
        this.estateTransactions = estateTransactions;
    }

    public Integer getEstateAgentId() {
        return estateAgentId;
    }

    public void setEstateAgentId(Integer estateAgentId) {
        this.estateAgentId = estateAgentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Set<EstateTransaction> getEstateTransactions() {
        return estateTransactions;
    }

    public void setEstateTransactions(Set<EstateTransaction> estateTransactions) {
        this.estateTransactions = estateTransactions;
    }

    @Override
    public String toString() {
        return "EstateAgent{" +
                "estateAgentId=" + estateAgentId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", isActive=" + isActive +
                ", estateTransactions=" + estateTransactions +
                '}';
    }
}
