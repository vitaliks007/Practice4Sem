package com.Vitaliy.courses.task1.subtask3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("Ivan");
        bank.getAccounts().get(0).addCard();
        bank.createTransaction(bank.getAccounts().get(0).getCards().get(0), 100);
        System.out.println(bank.getAccounts().get(0).getCards().get(0).getValue());
    }
}
