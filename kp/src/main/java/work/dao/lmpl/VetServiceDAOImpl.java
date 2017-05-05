package work.dao.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.dao.VetServiceDAO;
import work.entity.VetService;
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
    public work.entity.VetService getService(int ids) {
        String query = "SELECT e.* FROM service e WHERE e.id_service like '%"+ ids +"%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<work.entity.VetService> users = new ArrayList<work.entity.VetService>();
        for(Object[] userObject: userObjects) {
            work.entity.VetService user = new work.entity.VetService();
            int id = (int) userObject[0];
            float cost = (float) userObject[1];
            Date date = (Date) userObject[2];
            int id_doctor= 0;
            if (userObject[3]!=null) {
                id_doctor = (int) userObject[3];
            }
            String login = (String) userObject[4];
            String name = (String) userObject[5];
            String time = (String) userObject[6];
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
        return users.get(0);
    }

    @Override
    public List<work.entity.VetService> getAllServices() {
        return hibernateUtil.fetchAll(work.entity.VetService.class);
    }

    @Override
    public VetService updateService(VetService service) {
        return hibernateUtil.update(service);
    }

    @Override
    public void deleteService(int id) {
        VetService e = new VetService();
        e.setIdService(id);
        hibernateUtil.delete(e);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<work.entity.VetService> getAllServices(String userName) {
        String query = "SELECT e.* FROM service e WHERE e.login like '%"+ userName +"%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<work.entity.VetService> users = new ArrayList<work.entity.VetService>();
        for(Object[] userObject: userObjects) {
            work.entity.VetService user = new work.entity.VetService();
            System.out.print(userObject[1]+" "+userObject[2]+" "+userObject[3]+" " +
                    userObject[4] + " " + userObject[5]+" " + userObject[6]+" ");
            int id = (int) userObject[0];
            float cost = (float) userObject[1];
            Date date = (Date) userObject[2];
            int id_doctor= 0;
            if (userObject[3]!=null) {
                id_doctor = (int) userObject[3];
            }
            String login = (String) userObject[4];
            String name = (String) userObject[5];
            String time = (String) userObject[6];
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

