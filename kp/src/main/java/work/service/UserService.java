package work.service;

import work.entity.User;

import java.util.List;

public interface UserService {
    public long createUser(User user);
    public User getUser(String login);
    public List<User> getAllUsers(String userName);
}
