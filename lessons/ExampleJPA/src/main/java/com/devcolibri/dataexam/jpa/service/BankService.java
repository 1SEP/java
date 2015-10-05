package com.devcolibri.dataexam.jpa.service;

import com.devcolibri.dataexam.jpa.entity.entities.Bank;

import java.util.List;

public interface BankService {
    Bank addBank(Bank bank);
    void delete(long id);
    Bank getByName(String name);
    Bank editBank(Bank bank);
    List<Bank> getAll();
}
