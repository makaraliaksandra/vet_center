package work.service;

import work.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    public int createUserInfo(UserInfo user);
    public UserInfo getUserInfo(String login);
    public List<UserInfo> getAllUsersInfo();
    public List<UserInfo> getAllUsersInfo(String userName);
}
