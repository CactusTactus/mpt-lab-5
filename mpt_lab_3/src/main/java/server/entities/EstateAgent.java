package server.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "estate_agent")
@XmlRootElement
public class EstateAgent {
    Integer id;
    String name;
    Integer salary;
    Boolean isActive;

    public EstateAgent() {}

    public EstateAgent(Integer id, String name, Integer salary, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "EstateAgent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", isActive=" + isActive +
                '}';
    }
}