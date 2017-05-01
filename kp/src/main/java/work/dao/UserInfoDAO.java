package work.dao;

import work.entity.UserInfo;

import java.util.List;

public interface UserInfoDAO {
    public int createUserInfo(UserInfo user);
    public UserInfo getUserInfo(String login);
    public List<UserInfo> getAllUsersInfo();
    public List<UserInfo> getAllUsersInfo(String userName);
}
