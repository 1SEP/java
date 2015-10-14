package ru.fsep.lessons.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.models.User;

public interface UserDao extends JpaRepository<User, Integer>{
}
