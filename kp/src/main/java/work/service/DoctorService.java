package work.service;

import work.entity.Doctor;

import java.util.List;

public interface DoctorService {
    public int createDoctor(Doctor user);
    public Doctor getDoctor(String login);
    public List<Doctor> getAllDoctor();
    public List<Doctor> getAllDoctor(String userName);
}
