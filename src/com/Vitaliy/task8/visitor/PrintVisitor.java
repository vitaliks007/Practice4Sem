package com.Vitaliy.task8.visitor;

public class PrintVisitor implements Visitor {
    @Override
    public void visitFish(Fish fish) {
        System.out.println("Fish");
    }

    @Override
    public void visitDrink(Drink drink) {
        System.out.println("Drink");
    }
}
