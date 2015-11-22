package ru.fsep.lessons.services;

import ru.fsep.lessons.models.User;

import java.util.List;

/**
 * 21.11.15
 * UserService
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
public interface UserService {
    User findUser(int id);
    User save(User user);
    void update(User user);
    void delete(int id);
    List<User> getAll();

}
