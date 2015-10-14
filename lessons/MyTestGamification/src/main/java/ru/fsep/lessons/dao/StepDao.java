package ru.fsep.lessons.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.models.Step;

public interface StepDao extends JpaRepository<Step, Integer> {
}
