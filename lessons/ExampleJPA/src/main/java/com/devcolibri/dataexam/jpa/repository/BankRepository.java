package com.devcolibri.dataexam.jpa.repository;

import com.devcolibri.dataexam.jpa.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long>{
    Bank findByName(String name);
}
