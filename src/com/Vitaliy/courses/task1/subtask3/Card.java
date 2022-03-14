package com.Vitaliy.courses.task1.subtask3;

public class Card {
    private int value;
    private Account owner;

    public Card(Account owner) {
        this.owner = owner;
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Account getOwner() {
        return owner;
    }
}
