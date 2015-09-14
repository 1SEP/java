package com.devcolibri.dataexam.jpa.service;

import com.devcolibri.dataexam.jpa.entity.Bank;

import java.util.List;

/**
 * Created by ildar on 08.09.15.
 */
public interface BankService {
    Bank addBank(Bank bank);
    void delete(long id);
    Bank getByName(String name);
    Bank editBank(Bank bank);
    List<Bank> getAll();
}
