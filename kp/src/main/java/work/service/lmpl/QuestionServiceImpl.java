package work.service.lmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.dao.QuestionDAO;
import work.entity.Question;
import work.service.QuestionService;

import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    public QuestionServiceImpl() {
        System.out.println("QuestionServiceImpl()");
    }

    @Autowired
    private QuestionDAO QuestionDAO;

    public Question updateQuestion(Question service) {
        return QuestionDAO.updateQuestion(service);
    }

    @Override
    public int createQuestion(Question ad) {
        return QuestionDAO.createQuestion(ad);
    }

    @Override
    public List<Question> getAllQuestions() {
        return QuestionDAO.getAllQuestions();
    }
}
