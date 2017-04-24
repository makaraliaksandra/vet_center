package work.dao;

import work.entity.User;

import java.util.List;

public interface UserDAO {
    public String createUser(User user);
    public User getUser(String login);
    public List<User> getAllUsers();
    public List<User> getAllUsers(String userName);
}
