package work.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ad")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ad;

    @Column(name = "text_ad")
    private String text_ad;

    @Column(name = "start_day")
    private Date start_day;

    @Column(name = "active_period")
    private String active_period;

    @Column(name = "login")
    private String login;

    @Column(name = "id_category")
    private Integer id_category;

    public int getIdAd() {
        return id_ad;
    }

    public void setIdAd(int idAd) {
        this.id_ad = idAd;
    }

    @Basic
    @Column(name = "text_ad")
    public String getTextAd() {
        return text_ad;
    }

    public void setTextAd(String textAd) {
        this.text_ad = textAd;
    }

    @Basic
    @Column(name = "start_day")
    public Date getStartDay() {
        return start_day;
    }

    public void setStartDay(Date startDay) {
        this.start_day = startDay;
    }

    @Basic
    @Column(name = "active_period")
    public String getActivePeriod() {
        return active_period;
    }

    public void setActivePeriod(String activePeriod) {
        this.active_period = activePeriod;
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
    @Column(name = "id_category")
    public Integer getIdCategory() {
        return id_category;
    }

    public void setIdCategory(Integer idCategory) {
        this.id_category = idCategory;
    }
}
