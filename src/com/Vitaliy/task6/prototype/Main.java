package com.Vitaliy.task6.prototype;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.setCost(100);
        drink.setVol(500);
        Drink drink2 = drink.clone();

        drink.printProduct();
        drink2.printProduct();
    }
}
