package com.devcolibri.dataexam.jpa.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "bank_account")
public class BankAccount {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column
    private long id;

    @Column
    private double currency;

    @Column
    private double amount;

    @Column
    private double amountOfCredit;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {MERGE, PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public BankAccount() {
    }

    public BankAccount(double currency, double amount, double amountOfCredit, Client client) {
        this.currency = currency;
        this.amount = amount;
        this.amountOfCredit = amountOfCredit;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public double getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public double getAmountOfCredit() {
        return amountOfCredit;
    }

    public Client getClient() {
        return client;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAmountOfCredit(double amountOfCredit) {
        this.amountOfCredit = amountOfCredit;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
