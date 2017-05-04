package work.service.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.dao.BdserviceDAO;
import work.dao.UserDAO;
import work.entity.Bdservice;
import work.entity.User;
import work.service.BDserviceManage;
import work.service.UserService;

import java.util.List;

@Service
@Transactional
public class Bdservicelmpl implements BDserviceManage {

    public Bdservicelmpl() {
        System.out.println("BdserviceImpl()");
    }

    @Autowired
    private BdserviceDAO bdserviceDAO;

    @Override
    public String createBDService(Bdservice service) {
        return bdserviceDAO.createBdservice(service);
    }

    @Override
    public Bdservice getUser(String service) {
        return bdserviceDAO.getBdservice(service);
    }

    @Override
    public List<Bdservice> getAllBDServices() {
        return bdserviceDAO.getAllBdservices();
    }

    @Override
    public List<Bdservice> getAllBDServices(String service) {
        return bdserviceDAO.getAllBdservices(service);
    }
}
