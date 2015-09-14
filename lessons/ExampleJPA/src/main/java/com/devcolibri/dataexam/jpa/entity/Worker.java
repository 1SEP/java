package com.devcolibri.dataexam.jpa.entity;

import com.devcolibri.dataexam.jpa.entity.enums.WorkerStatus;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private WorkerStatus status;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {MERGE, PERSIST})
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    public Worker() {
    }

    public Worker(String firstName, String lastName, WorkerStatus status, String phoneNumber, Bank bank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public WorkerStatus getStatus() {
        return status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStatus(WorkerStatus status) {
        this.status = status;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
