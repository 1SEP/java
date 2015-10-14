package ru.fsep.lessons.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.models.Task;

public interface TaskDao extends JpaRepository<Task, Integer> {
}
