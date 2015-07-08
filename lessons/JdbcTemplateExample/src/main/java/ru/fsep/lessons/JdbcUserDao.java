package ru.fsep.lessons;

import java.util.List;

public interface JdbcUserDao {
    void insert(User user);
    User findById(int id);
    List<User> getAllUsers();
    void updateUser(int id, String newUsername, String newPassword);
    void delete(int id);
}
