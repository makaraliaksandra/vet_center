package work.service;


import java.util.List;

public interface VetService {
    public int createService(work.entity.VetService service);
    public work.entity.VetService getService(String service);
    public List<work.entity.VetService> getAllServices();
    public List<work.entity.VetService> getAllServices(String userName);
}
