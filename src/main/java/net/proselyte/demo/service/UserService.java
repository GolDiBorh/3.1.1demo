package net.proselyte.demo.service;



import net.proselyte.demo.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    public User show(Long id);
    void update(User user);
    void delete(Long id);

}
