package com.devcolibri.dataexam.service;

import com.devcolibri.dataexam.entity.Client;

import java.util.List;

/**
 * 27.10.15
 * ClientService
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
public interface ClientService {
    Client addClient(Client client);
    Client getClient(long id);
    List<Client> getAll();
}
