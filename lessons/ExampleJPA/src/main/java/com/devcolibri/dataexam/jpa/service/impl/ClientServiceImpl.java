package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.entity.entities.Client;
import com.devcolibri.dataexam.jpa.repository.ClientRepository;
import com.devcolibri.dataexam.jpa.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public Client getClient(long id) {
        return clientRepository.findOne(id);
    }

    @Override
    public void deleteClient(long id) {
        clientRepository.delete(id);
    }

    @Override
    public List<Client> getAllClients() {
        List<Client> result = clientRepository.findAll();
        return result;
    }
}
