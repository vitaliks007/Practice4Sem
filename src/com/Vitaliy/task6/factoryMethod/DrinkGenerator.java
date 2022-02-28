package com.Vitaliy.task6.factoryMethod;

public class DrinkGenerator extends ProductGenerator {
    @Override
    public Product createProduct() {
        return new Drink();
    }
}
