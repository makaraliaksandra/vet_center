package work.dao.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.dao.VetServiceDAO;
import work.util.HibernateUtil;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VetServiceDAOImpl implements VetServiceDAO {

    public VetServiceDAOImpl() {}

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public int createService(work.entity.VetService user) {
        return (int) hibernateUtil.create(user);
    }

    @Override
    public work.entity.VetService getService(String login) {
        return hibernateUtil.fetchById(login, work.entity.VetService.class);
    }

    @Override
    public List<work.entity.VetService> getAllServices() {
        return hibernateUtil.fetchAll(work.entity.VetService.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<work.entity.VetService> getAllServices(String userName) {
        String query = "SELECT e.* FROM service e WHERE e.login like '%"+ userName +"%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<work.entity.VetService> users = new ArrayList<work.entity.VetService>();
        for(Object[] userObject: userObjects) {
            work.entity.VetService user = new work.entity.VetService();
            int id = (int) userObject[1];
            double cost = (double) userObject[2];
            Date date = (Date) userObject[3];
            int id_doctor = (int) userObject[4];
            String login = (String) userObject[5];
            String name = (String) userObject[6];
            String time = (String) userObject[7];
            user.setIdService(id);
            user.setCost(cost);
            user.setDate(date);
            user.setIdDoctor(id_doctor);
            user.setLogin(login);
            user.setName(name);
            user.setTime(time);
            users.add(user);
        }
        System.out.println(users);
        return users;
    }
}

