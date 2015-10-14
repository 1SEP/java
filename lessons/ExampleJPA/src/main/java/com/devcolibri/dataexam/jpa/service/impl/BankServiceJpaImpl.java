package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import com.devcolibri.dataexam.jpa.repository.BankRepository;
import com.devcolibri.dataexam.jpa.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankServiceJpaImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

//    @CacheEvict(value = "banks", allEntries = true)
    public Bank addBank(Bank bank) {
        Bank result = bankRepository.saveAndFlush(bank);
        return result;
    }

//    @CacheEvict(value = "banks", allEntries = true)
    public void delete(long id) {
        bankRepository.delete(id);
    }

//    @Cacheable("banks")
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

//    @CacheEvict(value = "banks", allEntries = true)
    public Bank editBank(Bank bank) {
        Bank result = bankRepository.saveAndFlush(bank);
        return result;
    }

//    @Cacheable("banks")
//    @Transactional(readOnly = true)
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
