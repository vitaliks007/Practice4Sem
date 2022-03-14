package com.Vitaliy.courses.task1.subtask3;

import java.util.ArrayList;

public class Account {
    private String name;
    private ArrayList<Card> cards = new ArrayList<>();

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard() {
        cards.add(new Card(this));
    }
}
