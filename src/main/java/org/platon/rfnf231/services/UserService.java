package org.platon.rfnf231.services;

import org.platon.rfnf231.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(long id);
    void saveUser(User user);
    void deleteUser(long id);
}
