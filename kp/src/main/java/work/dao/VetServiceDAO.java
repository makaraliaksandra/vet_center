package work.dao;

import work.entity.VetService;

import java.util.List;

public interface VetServiceDAO {
    public int createService(VetService service);
    public VetService getService(String login);
    public VetService getService(int id);
    public List<VetService> getAllServices();
    public List<VetService> getAllServices(String userName);
    public void deleteService(int id);
    public VetService updateService(VetService service);
}
