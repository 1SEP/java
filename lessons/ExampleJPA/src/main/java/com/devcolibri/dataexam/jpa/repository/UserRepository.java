package com.devcolibri.dataexam.jpa.repository;

import com.devcolibri.dataexam.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
