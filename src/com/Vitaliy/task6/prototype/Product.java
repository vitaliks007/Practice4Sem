package com.Vitaliy.task6.prototype;

public abstract class Product {
    private int cost;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(Product target) {
        this.cost = target.cost;
    }

    public Product() {
    }

    public abstract Product clone();
    public abstract void printProduct();

    public int getCost() {
        return cost;
    }
}