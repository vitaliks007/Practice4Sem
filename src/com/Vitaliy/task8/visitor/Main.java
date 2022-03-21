package com.Vitaliy.task8.visitor;

public class Main {
    public static void main(String[] args) {
        Visitor printVisitor = new PrintVisitor();
        printVisitor.visitDrink(new Drink());
        printVisitor.visitFish(new Fish());
    }
}
