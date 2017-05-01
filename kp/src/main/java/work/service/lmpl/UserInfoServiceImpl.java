package work.service.lmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.dao.UserInfoDAO;
import work.entity.UserInfo;
import work.service.UserInfoService;

import java.util.List;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    public UserInfoServiceImpl() {
        System.out.println("UserInfoServiceImpl()");
    }

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public int createUserInfo(UserInfo user) {
        return userInfoDAO.createUserInfo(user);
    }

    @Override
    public UserInfo getUserInfo(String user) {
        return userInfoDAO.getUserInfo(user);
    }

    @Override
    public List<UserInfo> getAllUsersInfo() {
        return userInfoDAO.getAllUsersInfo();
    }

    @Override
    public List<UserInfo> getAllUsersInfo(String userName) {
        return userInfoDAO.getAllUsersInfo(userName);
    }
}
