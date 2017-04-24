package work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String login;

    @Column
    private Integer id_role;

    @Column
    private String password;

    public User(String Login, String Password) {
        this.login = Login;
        this.password = Password;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String lastName) {
        this.password = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String firstName) {
        this.login = firstName;
    }

    public Integer getIdRole() {
        return id_role;
    }

    public void setIdRole(Integer Id) {
        this.id_role = Id;
    }

    @Override
    public String toString() {
        return "User{" +
                "login=" + login +
                ", password='" + password + '\'' +
                ", idRole=" + id_role +
                '}';
    }
}
