package work.service;

import work.entity.Bdservice;

import java.util.List;

public interface BDserviceManage {
    public String createBDService(Bdservice service);
    public Bdservice getUser(String login);
    public List<Bdservice> getAllBDServices();
    public List<Bdservice> getAllBDServices(String userName);
}