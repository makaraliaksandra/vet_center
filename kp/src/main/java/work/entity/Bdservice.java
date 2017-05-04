package work.entity;

import javax.persistence.*;


@Entity
@Table(name = "bdservice", schema = "baidakova_d_v_makar_a_a")
public class Bdservice {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private float cost;

    @Column(name = "sale")
    private Integer sale;


    @Column
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }
}
