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

    public UserDAOImpl() {
        System.out.println("EmployeeDAOImpl");
    }

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
/*
    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllEmployees(String employeeName) {
        String query = "SELECT e.* FROM Employees e WHERE e.name like '%"+ employeeName +"%'";
        List<Object[]> employeeObjects = hibernateUtil.fetchAll(query);
        List<Employee> employees = new ArrayList<Employee>();
        for(Object[] employeeObject: employeeObjects) {
            Employee employee = new Employee();
            long id = ((BigInteger) employeeObject[0]).longValue();
            int age = (int) employeeObject[1];
            String name = (String) employeeObject[2];
            float salary = (float) employeeObject[3];
            employee.setId(id);
            employee.setName(name);
            employee.setAge(age);
            employee.setSalary(salary);
            employees.add(employee);
        }
        System.out.println(employees);
        return employees;
    }*/
}