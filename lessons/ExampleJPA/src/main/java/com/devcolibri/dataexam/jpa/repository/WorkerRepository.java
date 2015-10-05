package com.devcolibri.dataexam.jpa.repository;

import com.devcolibri.dataexam.jpa.entity.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
}
