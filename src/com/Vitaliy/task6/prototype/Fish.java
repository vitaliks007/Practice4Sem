package com.Vitaliy.task6.prototype;

public class Fish extends Product{
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Fish() {
    }

    public Fish(Fish target) {
        super(target);
        this.weight = target.weight;
    }

    @Override
    public Fish clone() {
        return new Fish(this);
    }

    @Override
    public void printProduct() {
        System.out.println(this.getCost() + " " + weight);
    }
}
