package work.service;


import java.util.List;

public interface VetService {
    public int createService(work.entity.VetService service);
    public work.entity.VetService getService(String service);
    public work.entity.VetService getService(int service);
    public List<work.entity.VetService> getAllServices();
    public List<work.entity.VetService> getAllServices(String userName);
    public work.entity.VetService updateService(work.entity.VetService employee);
    public void deleteService(int id);
}
