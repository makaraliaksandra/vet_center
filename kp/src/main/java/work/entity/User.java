package work.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column
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
    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
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

    @Override
    public String toString() {
        return "User{" +
                "login=" + login +
                ", password='" + password + '\'' +
                ", idRole=" + id_role +
                '}';
    }
}
