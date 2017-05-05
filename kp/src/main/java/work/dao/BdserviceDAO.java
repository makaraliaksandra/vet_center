package work.dao;

import work.entity.Bdservice;
import work.entity.User;

import java.util.List;


public interface BdserviceDAO {
    public String createBdservice(Bdservice service);
    public Bdservice getBdservice(String name);
    public List<Bdservice> getAllBdservices();
    public List<Bdservice> getAllBdservices(String name);
    public Bdservice updateService(Bdservice service);
}
