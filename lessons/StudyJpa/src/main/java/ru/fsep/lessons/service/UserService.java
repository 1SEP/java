package ru.fsep.lessons.service;

import ru.fsep.lessons.models.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    User save(User user);
    User update(User user);
    void delete(int id);
    List<User> getAll();
}
