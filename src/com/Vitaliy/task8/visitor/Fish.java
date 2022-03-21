package com.Vitaliy.task8.visitor;

public class Fish implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFish(this);
    }
}
