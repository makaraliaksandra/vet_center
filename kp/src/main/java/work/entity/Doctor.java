package work.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    private int idDoctor;
    private String surname;
    private String initials;
    private String direction;
    private String position;

    @Id
    @Column(name = "id_doctor")
    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "initials")
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    @Basic
    @Column(name = "direction")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doctor that = (Doctor) o;

        if (idDoctor != that.idDoctor) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (initials != null ? !initials.equals(that.initials) : that.initials != null) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDoctor;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (initials != null ? initials.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
