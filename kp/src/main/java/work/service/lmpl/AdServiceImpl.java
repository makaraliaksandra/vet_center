package work.service.lmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.dao.AdDAO;
import work.entity.Ad;
import work.service.AdService;

import java.util.List;

@Service
@Transactional
public class AdServiceImpl implements AdService {

    public AdServiceImpl() {
        System.out.println("AdServiceImpl()");
    }

    @Autowired
    private AdDAO AdDAO;

    @Override
    public int createAd(Ad ad) {
        return AdDAO.createAd(ad);
    }

    @Override
    public List<Ad> getAllAds() {
        return AdDAO.getAllAds();
    }
}
