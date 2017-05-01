package work.service;

import work.entity.Question;
import java.util.List;

public interface QuestionService {
    public int createQuestion(Question ad);
    public List<Question> getAllQuestions();
}
