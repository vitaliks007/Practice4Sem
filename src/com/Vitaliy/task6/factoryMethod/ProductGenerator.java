package com.Vitaliy.task6.factoryMethod;

public abstract class ProductGenerator {
    public void printProduct() {
        Product product = createProduct();
        product.printName();
    }

    public abstract Product createProduct();
}
