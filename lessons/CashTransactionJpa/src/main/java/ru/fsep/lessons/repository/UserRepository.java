package ru.fsep.lessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
