package work.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @Column(name = "idQuestion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuestion;

    @Column(name = "login")
    private String login;

    @Column(name = "status")
    private int status;

    @Column(name = "textQuestion")
    private String textQuestion;

    @Column(name = "answer")
    private String answer;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
