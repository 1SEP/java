package com.devcolibri.dataexam.service.impl;

import com.devcolibri.dataexam.entity.Client;
import com.devcolibri.dataexam.repository.ClientRepository;
import com.devcolibri.dataexam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 27.10.15
 * ClientServiceImpl
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public Client getClient(long id) {
        return clientRepository.findOne(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
