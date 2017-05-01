package work.service;

import work.entity.Ad;
import java.util.List;

public interface AdService {
    public int createAd(Ad ad);
    public List<Ad> getAllAds();
}
