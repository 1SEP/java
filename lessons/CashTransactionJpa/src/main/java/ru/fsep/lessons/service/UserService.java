package ru.fsep.lessons.service;

import ru.fsep.lessons.entities.User;

import java.util.Set;

public interface UserService {
    User getUser(int id);
    User addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    Set<User> getAllUsers();
}
