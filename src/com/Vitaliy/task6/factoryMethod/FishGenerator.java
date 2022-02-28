package com.Vitaliy.task6.factoryMethod;

public class FishGenerator extends ProductGenerator{
    @Override
    public Product createProduct() {
        return new Fish();
    }
}
