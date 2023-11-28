package org.platon.rfnf231.dao;

import org.platon.rfnf231.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void saveUser(User user);
    void deleteUser(long id);
}
