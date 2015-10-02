package com.devcolibri.dataexam.jpa.repository;

import com.devcolibri.dataexam.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
