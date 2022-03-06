package com.Vitaliy.task6.abstractFactory;

public class ColdGenerator implements ProductGenerator{
    @Override
    public Fish createFish() {
        return new ColdFish();
    }

    @Override
    public Drink createDrink() {
        return new ColdDrink();
    }
}
