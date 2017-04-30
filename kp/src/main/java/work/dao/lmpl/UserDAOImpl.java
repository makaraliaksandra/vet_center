package work.dao.lmpl;

import work.dao.UserDAO;
import work.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    public UserDAOImpl() {}

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public String createUser(User user) {
        return (String) hibernateUtil.create(user);
    }

    @Override
    public User getUser(String login) {
        return hibernateUtil.fetchById(login, User.class);
    }

    @Override
    public List<User> getAllUsers() {
        return hibernateUtil.fetchAll(User.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers(String userName) {
        String query = "SELECT e.* FROM User e WHERE e.login like '%"+ userName +"%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<User> users = new ArrayList<User>();
        for(Object[] userObject: userObjects) {
            User employee = new User();
            String name = (String) userObject[1];
            String pass = (String) userObject[2];
            int id = (int) userObject[3];
            employee.setId_role(id);
            employee.setLogin(name);
            employee.setPassword(pass);
            users.add(employee);
        }
        System.out.println(users);
        return users;
    }
}