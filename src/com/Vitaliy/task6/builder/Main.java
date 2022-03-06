package com.Vitaliy.task6.builder;

public class Main {
    public static void main(String[] args) {
        ProductBuilder builder = new HotFishBuilder();
        ProductDirector director = new ProductDirector(builder);
        Product hotFish = director.createProduct();

        builder = new ColdDrinkBuilder();
        director = new ProductDirector(builder);
        Product coldDrink = director.createProduct();

        coldDrink.printProduct();
        hotFish.printProduct();
    }
}
