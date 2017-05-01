package work.dao.lmpl;

import work.dao.AdDAO;
import work.entity.Ad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import work.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdDAOImpl implements AdDAO {

    public AdDAOImpl() {}

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public int createAd(Ad ad) {
        return (int) hibernateUtil.create(ad);
    }

    @Override
    public List<Ad> getAllAds() {
        return hibernateUtil.fetchAll(Ad.class);
    }

}