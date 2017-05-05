package work.dao;

import work.entity.Question;

import java.util.List;

public interface QuestionDAO {
    public int createQuestion(Question qw);
    public List<Question> getAllQuestions();
    public Question updateQuestion(Question service);
}
