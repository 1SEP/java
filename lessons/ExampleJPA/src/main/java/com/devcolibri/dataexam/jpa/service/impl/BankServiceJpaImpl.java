package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import com.devcolibri.dataexam.jpa.repository.BankRepository;
import com.devcolibri.dataexam.jpa.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceJpaImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    public Bank addBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    public void delete(long id) {
        bankRepository.delete(id);
    }

    @Cacheable("bank")
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
