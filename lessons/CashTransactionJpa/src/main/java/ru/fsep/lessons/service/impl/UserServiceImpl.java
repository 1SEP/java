package ru.fsep.lessons.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.fsep.lessons.entities.User;
import ru.fsep.lessons.repository.UserRepository;
import ru.fsep.lessons.service.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(int id) {
        return userRepository.findOne(id);
    }

    public User addUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    public Set<User> getAllUsers() {
        List<User> all = userRepository.findAll();
        return new HashSet<User>(all);
    }
}
