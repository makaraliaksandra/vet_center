package work.service.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.dao.DoctorDAO;
import work.entity.Doctor;
import work.service.DoctorService;

import java.util.List;

@Service
@Transactional
public class DoctorServicelmpl implements DoctorService {

public DoctorServicelmpl() {
        System.out.println("DoctorServiceImpl()");
        }

@Autowired
private DoctorDAO userInfoDAO;

@Override
public int createDoctor(Doctor user) {
        return userInfoDAO.createDoctor(user);
        }

@Override
public Doctor getDoctor(String user) {
        return userInfoDAO.getDoctor(user);
        }

@Override
public List<Doctor> getAllDoctor() {
        return userInfoDAO.getAllDoctor();
        }

@Override
public List<Doctor> getAllDoctor(String userName) {
        return userInfoDAO.getAllDoctor(userName);
        }
        }
