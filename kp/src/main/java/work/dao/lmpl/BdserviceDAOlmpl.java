package work.dao.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.dao.BdserviceDAO;
import work.dao.UserDAO;
import work.entity.Bdservice;
import work.entity.User;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BdserviceDAOlmpl implements BdserviceDAO {

    public BdserviceDAOlmpl() {
    }

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public String createBdservice(Bdservice service) {
        return (String) hibernateUtil.create(service);
    }

    @Override
    public Bdservice getBdservice(String name) {
        return hibernateUtil.fetchById(name, Bdservice.class);
    }

    @Override
    public Bdservice updateService(Bdservice service) {
        return hibernateUtil.update(service);
    }

    @Override
    public List<Bdservice> getAllBdservices() {
        return hibernateUtil.fetchAll(Bdservice.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bdservice> getAllBdservices(String service) {
        String query = "SELECT e.* FROM bdservice e WHERE e.name like '%" + service + "%'";
        List<Object[]> userObjects = hibernateUtil.<Object[]>fetchAll(query);
        List<Bdservice> s = new ArrayList<Bdservice>();
        for (Object[] userObject : userObjects) {
            Bdservice serv = new Bdservice();
            String name = (String) userObject[0];
            float cost = (float) userObject[1];
            int sale = (int) userObject[3];
            String text = (String) userObject[2];
            serv.setName(name);
            serv.setCost(cost);
            serv.setSale(sale);
            serv.setDescription(text);
            s.add(serv);
        }
        System.out.println(s);
        return s;
    }
}
