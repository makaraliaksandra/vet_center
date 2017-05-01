package work.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_question;

    @Column(name = "text_question")
    private String text_question;

    @Column(name = "login")
    private String login;

    @Id
    @Column(name = "id_question")
    public int getIdQuestion() {
        return id_question;
    }

    public void setIdQuestion(int idQuestion) {
        this.id_question = idQuestion;
    }

    @Basic
    @Column(name = "text_question")
    public String getTextQuestion() {
        return text_question;
    }

    public void setTextQuestion(String textQuestion) {
        this.text_question = textQuestion;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question that = (Question) o;

        if (id_question != that.id_question) return false;
        if (text_question != null ? !text_question.equals(that.text_question) : that.text_question != null) return false;
        //if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id_question;
        result = 31 * result + (text_question != null ? text_question.hashCode() : 0);
        //result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "answer")
    private String answer;

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    @Basic
    @Column(name = "answer")
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "id_category")
    private Integer id_category;
    @Basic
    @Column(name = "id_category")
    public Integer getId_category() {
        return id_category;
    }

    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }
}
