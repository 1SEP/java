package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.entity.User;
import com.devcolibri.dataexam.jpa.repository.UserRepository;
import com.devcolibri.dataexam.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User getUser(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User update(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> result = userRepository.findAll();
        return result;
    }
}
