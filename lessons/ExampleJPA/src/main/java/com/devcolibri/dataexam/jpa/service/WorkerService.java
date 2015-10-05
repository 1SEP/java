package com.devcolibri.dataexam.jpa.service;

import com.devcolibri.dataexam.jpa.entity.entities.Worker;

import java.util.List;

public interface WorkerService {
    Worker addWorker(Worker worker);
    Worker getWorker(long id);
    List<Worker> getAllworkers();
    void deleteWorker(long id);
}
