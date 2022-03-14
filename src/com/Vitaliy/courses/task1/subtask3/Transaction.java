package com.Vitaliy.courses.task1.subtask3;

public class Transaction {
    private Card card;
    private int value;

     public Transaction(Card card, int value) {
          this.card = card;
          this.value = value;
          makeTransaction();
     }

     private void makeTransaction() {
        card.setValue(card.getValue() + value);
     }
}
