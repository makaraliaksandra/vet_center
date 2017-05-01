package work.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserInfo;

    @Column(name = "email")
    private String email;

    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "number_passport")
    private String number_passport;

    @Column(name = "surname")
    private String surname;

    @Column(name = "telephone")
    private String telephone;


    public int getIdUserInfo() {
        return idUserInfo;
    }

    public void setIdUserInfo(int idUserInfo) {
        this.idUserInfo = idUserInfo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPassport() {
        return number_passport;
    }

    public void setNumberPassport(String number_passport) {
        this.number_passport = number_passport;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
