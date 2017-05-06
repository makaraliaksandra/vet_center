package work.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ad")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAd;

    @Column(name = "textAd")
    private String textAd;

    @Column(name = "startDay")
    private Date startDay;

    @Column(name = "email")
    private String email;

    @Column(name = "login")
    private String login;

    public int getIdAd() {
        return idAd;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    public String getTextAd() {
        return textAd;
    }

    public void setTextAd(String textAd) {
        this.textAd = textAd;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String activePeriod) {
        this.email = activePeriod;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
