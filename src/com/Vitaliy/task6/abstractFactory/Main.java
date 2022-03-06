package com.Vitaliy.task6.abstractFactory;

public class Main {
    public static void main(String[] args) {
        ProductGenerator coldGenerator = new ColdGenerator();
        Fish coldFish = coldGenerator.createFish();
        Drink coldDrink = coldGenerator.createDrink();

        ProductGenerator hotGenerator = new HotGenerator();
        Fish hotFish = hotGenerator.createFish();
        Drink hotDrink = hotGenerator.createDrink();

        hotFish.printName();
        coldDrink.printName();
        coldFish.printName();
        hotDrink.printName();
    }
}
