package ru.fsep.lessons.service;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.fsep.lessons.models.User;
import ru.fsep.lessons.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User getUser(int id) {
        User result = userRepository.findOne(id);
        return result;
    }

    @Transactional
    public User save(User user) {
        User result = userRepository.saveAndFlush(user);
        return result;
    }

    @Transactional
    public User update(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Transactional
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Transactional(readOnly = true)
    public List<User> getAll() {
        List<User> result = userRepository.findAll();
        return result;
    }
}
