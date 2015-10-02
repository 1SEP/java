package com.devcolibri.dataexam.jpa.service;

import com.devcolibri.dataexam.jpa.entity.Client;

import java.util.List;

public interface ClientService {
    Client addClient(Client client);
    Client getClient(long id);
    void deleteClient(long id);
    List<Client> getAllClients();
}
