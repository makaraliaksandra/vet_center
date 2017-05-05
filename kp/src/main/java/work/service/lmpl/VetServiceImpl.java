package work.service.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.dao.VetServiceDAO;
import work.service.VetService;

import java.util.List;

@Service
@Transactional
public class VetServiceImpl implements VetService {

    public VetServiceImpl() {
        System.out.println("VetServiceImpl()");
    }

    @Autowired
    private VetServiceDAO serviceDAO;

    public work.entity.VetService updateService(work.entity.VetService service) {
        return serviceDAO.updateService(service);
    }
    @Override
    public void deleteService(int id) {
        serviceDAO.deleteService(id);
    }

    @Override
    public int createService(work.entity.VetService service) {
        return serviceDAO.createService(service);
    }

    @Override
    public work.entity.VetService getService(String service) {
        return serviceDAO.getService(service);
    }

    @Override
    public work.entity.VetService getService(int service) {
        return serviceDAO.getService(service);
    }


    @Override
    public List<work.entity.VetService> getAllServices() {
        return serviceDAO.getAllServices();
    }

    @Override
    public List<work.entity.VetService> getAllServices(String userName) {
        return serviceDAO.getAllServices(userName);
    }
}
