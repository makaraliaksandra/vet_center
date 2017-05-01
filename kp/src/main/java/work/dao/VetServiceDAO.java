package work.dao;

import work.entity.VetService;

import java.util.List;

public interface VetServiceDAO {
    public int createService(VetService service);
    public VetService getService(String login);
    public List<VetService> getAllServices();
    public List<VetService> getAllServices(String userName);
}
