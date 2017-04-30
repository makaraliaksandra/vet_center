package work.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ad")
public class Ad {
    private int idAd;
    private String textAd;
    private Date startDay;
    private String activePeriod;
    private String login;
    private Integer idCategory;

    @Id
    @Column(name = "id_ad")
    public int getIdAd() {
        return idAd;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    @Basic
    @Column(name = "text_ad")
    public String getTextAd() {
        return textAd;
    }

    public void setTextAd(String textAd) {
        this.textAd = textAd;
    }

    @Basic
    @Column(name = "start_day")
    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Basic
    @Column(name = "active_period")
    public String getActivePeriod() {
        return activePeriod;
    }

    public void setActivePeriod(String activePeriod) {
        this.activePeriod = activePeriod;
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
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ad ad = (Ad) o;

        if (idAd != ad.idAd) return false;
        if (textAd != null ? !textAd.equals(ad.textAd) : ad.textAd != null) return false;
        if (startDay != null ? !startDay.equals(ad.startDay) : ad.startDay != null) return false;
        if (activePeriod != null ? !activePeriod.equals(ad.activePeriod) : ad.activePeriod != null)
            return false;
        if (login != null ? !login.equals(ad.login) : ad.login != null) return false;
        if (idCategory != null ? !idCategory.equals(ad.idCategory) : ad.idCategory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAd;
        result = 31 * result + (textAd != null ? textAd.hashCode() : 0);
        result = 31 * result + (startDay != null ? startDay.hashCode() : 0);
        result = 31 * result + (activePeriod != null ? activePeriod.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (idCategory != null ? idCategory.hashCode() : 0);
        return result;
    }
}
