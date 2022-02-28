package com.Vitaliy.task6.factoryMethod;

public class Main {
    public static void main(String[] args) {
        ProductGenerator fish = new FishGenerator();
        ProductGenerator drink = new DrinkGenerator();
        drink.printProduct();
        fish.printProduct();
    }
}
