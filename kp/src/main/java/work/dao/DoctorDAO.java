package work.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.entity.Doctor;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public interface DoctorDAO {
    public int createDoctor(Doctor user);
    public Doctor getDoctor(String login);
    public List<Doctor> getAllDoctor();
    public List<Doctor> getAllDoctor(String userName);
}