package com.Vitaliy.task8.patternMethod;

public abstract class Product {
    private int cost;

    public abstract void printName();

    public Product(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public final void printCost() {
        System.out.println(cost);
    }
}
