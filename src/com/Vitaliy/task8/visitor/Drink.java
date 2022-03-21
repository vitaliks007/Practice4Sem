package com.Vitaliy.task8.visitor;

public class Drink implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitDrink(this);
    }
}
