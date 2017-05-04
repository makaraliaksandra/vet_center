package work.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "service")
public class VetService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_service;

    @Column
    private float cost;

    @Column
    private Date date;

    @Column(name = "id_doctor")
    private Integer id_doctor;

    @Column
    private String login;

    @Column
    private String name;

    @Column
    private String time;

    public int getIdService() {
        return id_service;
    }

    public void setIdService(int idService) {
        this.id_service = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdDoctor() {
        return id_doctor;
    }

    public void setIdDoctor(Integer id_doctor) {
        this.id_doctor = id_doctor;
    }
}
