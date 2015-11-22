package ru.fsep.lessons.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fsep.lessons.models.User;
import ru.fsep.lessons.repository.UserRepository;

import java.util.List;

/**
 * 21.11.15
 * UserServiceImpl
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUser(int id) {
        return userRepository.findOne(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public void delete(int id) {
        userRepository.delete(id);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
