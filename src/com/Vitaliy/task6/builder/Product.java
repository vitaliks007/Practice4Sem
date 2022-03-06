package com.Vitaliy.task6.builder;

public class Product {
    private String type;
    private String temp;

    public Product() {
        super();
    }

    public Product(String type, String temp) {
        this();
        this.type = type;
        this.temp = temp;
    }

    public void printProduct() {
        System.out.println(temp + " " + type);
    }
}
