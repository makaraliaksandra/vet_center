package work.dao;

import work.entity.Ad;

import java.util.List;

public interface AdDAO {
    public int createAd(Ad ad);
    public List<Ad> getAllAds();
}
