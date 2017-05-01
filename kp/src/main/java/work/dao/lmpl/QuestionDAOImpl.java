package work.dao.lmpl;

import work.dao.QuestionDAO;
import work.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

    public QuestionDAOImpl() {}

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public int createQuestion(Question qw) {
        return (int) hibernateUtil.create(qw);
    }

    @Override
    public List<Question> getAllQuestions() {
        return hibernateUtil.fetchAll(Question.class);
    }

}