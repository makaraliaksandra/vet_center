package work.dao.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.dao.UserInfoDAO;
import work.entity.UserInfo;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    public UserInfoDAOImpl() {}

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public int createUserInfo(UserInfo user) {
        return (int) hibernateUtil.create(user);
    }

    @Override
    public UserInfo getUserInfo(String login) {
        return hibernateUtil.fetchById(login, UserInfo.class);
    }

    @Override
    public List<UserInfo> getAllUsersInfo() {
        return hibernateUtil.fetchAll(UserInfo.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UserInfo> getAllUsersInfo(String userName) {
        String query = "SELECT e.* FROM user_info e WHERE e.login like '%"+ userName +"%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<UserInfo> users = new ArrayList<UserInfo>();
        for(Object[] userObject: userObjects) {
            UserInfo user = new UserInfo();
            int id = (int) userObject[1];
            String surname = (String) userObject[6];
            String name = (String) userObject[4];
            String passport = (String) userObject[5];
            String phone = (String) userObject[7];
            String email = (String) userObject[2];
            String login = (String) userObject[3];
            user.setIdUserInfo(id);
            user.setSurname(surname);
            user.setName(name);
            user.setNumberPassport(passport);
            user.setTelephone(phone);
            user.setEmail(email);
            user.setLogin(login);
            users.add(user);
        }
        System.out.println(users);
        return users;
    }
}
