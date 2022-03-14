package com.Vitaliy.courses.task1.subtask3;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void createAccount(String name) {
        accounts.add(new Account(name));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void createTransaction(Card card, int value) {
        transactions.add(new Transaction(card, value));
    }
}
