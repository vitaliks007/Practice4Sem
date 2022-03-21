package com.Vitaliy.task8.patternMethod;

public class Fish extends Product {
    public Fish(int cost) {
        super(cost);
    }

    @Override
    public void printName() {
        System.out.println("Fish");
    }
}
