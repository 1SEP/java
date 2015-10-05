package com.devcolibri.dataexam.jpa.service;

import com.devcolibri.dataexam.jpa.entity.User;

import java.util.List;

public interface UserService {
    User add(User user);
    User getUser(int id);
    User update(User user);
    void delete(int id);
    List<User> getAllUsers();
}
