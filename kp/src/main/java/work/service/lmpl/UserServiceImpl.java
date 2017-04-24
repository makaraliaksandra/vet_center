package work.service.lmpl;

import work.dao.UserDAO;
import work.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("EmployeeServiceImpl()");
    }

    @Autowired
    private UserDAO userDAO;

    @Override
    public long createUser(User user) {
        return userDAO.createUser(user);
    }

    @Override
    public User getUser(String user) {
        return userDAO.getUser(user);
    }

    @Override
    public List<User> getAllUsers(String userName) {
        return userDAO.getAllUsers(userName);
    }
}