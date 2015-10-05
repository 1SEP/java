package com.devcolibri.dataexam.jdbc;

import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import java.util.List;

public interface BankDao {
    List<Bank> getAll();
    Bank getBank(int id);
    Bank addBank(Bank bank);
}
