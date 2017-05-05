package work.dao.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.dao.DoctorDAO;
import work.entity.Doctor;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDAOlmpl implements DoctorDAO {

    public DoctorDAOlmpl() {}

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public int createDoctor(Doctor user) {
        return (int) hibernateUtil.create(user);
    }

    @Override
    public Doctor getDoctor(String login) {
        return hibernateUtil.fetchById(login, Doctor.class);
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return hibernateUtil.fetchAll(Doctor.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Doctor> getAllDoctor(String userName) {
        String query = "SELECT e.* FROM doctor e WHERE e.position like '%"+ userName +"%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<Doctor> users = new ArrayList<Doctor>();
        for(Object[] userObject: userObjects) {
            Doctor user = new Doctor();
            int id = (int) userObject[0];
            String surname = (String) userObject[4];
            String position = (String) userObject[3];
            String direction = (String) userObject[1];
            String initials = (String) userObject[2];
            user.setIdDoctor(id);
            user.setDirection(direction);
            user.setInitials(initials);
            user.setSurname(surname);
            user.setPosition(position);
            users.add(user);
        }
        System.out.println(users);
        return users;
    }
}
