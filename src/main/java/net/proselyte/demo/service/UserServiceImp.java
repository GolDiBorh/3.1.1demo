package net.proselyte.demo.service;

import net.proselyte.demo.model.User;
import net.proselyte.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void add(User user) {
        userRepository.save(user);

    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User show(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void update( User user) {
        userRepository.save(user);

    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
