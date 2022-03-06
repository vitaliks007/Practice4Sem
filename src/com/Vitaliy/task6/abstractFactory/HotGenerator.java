package com.Vitaliy.task6.abstractFactory;

public class HotGenerator implements ProductGenerator{
    @Override
    public Fish createFish() {
        return new HotFish();
    }

    @Override
    public Drink createDrink() {
        return new HotDrink();
    }
}
