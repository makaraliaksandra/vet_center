package work.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "service")
public class Service {
    private int idService;
    private String name;
    private Date date;
    private String time;
    private Double cost;
    private String login;
    private Integer idDoctor;

    @Id
    @Column(name = "id_service")
    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "id_doctor")
    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service that = (Service) o;

        if (idService != that.idService) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (idDoctor != null ? !idDoctor.equals(that.idDoctor) : that.idDoctor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idService;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (idDoctor != null ? idDoctor.hashCode() : 0);
        return result;
    }
}
