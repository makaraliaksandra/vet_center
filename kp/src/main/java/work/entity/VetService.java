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
    private Double cost;

    @Column
    private Date date;

    @Column(name = "id_doctor")
    private Integer idDoctor;

    @Column
    private String login;

    @Column
    private String name;

    @Column
    private String number_passport;

    @Column
    private String time;

    public String getNumber_passport() {
        return number_passport;
    }

    public void setNumber_passport(String number_passport) {
        this.number_passport = number_passport;
    }

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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }
}
