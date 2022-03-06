package com.Vitaliy.task6.builder;

public class ColdDrinkBuilder implements ProductBuilder{
    private String type;
    private String temp;

    public ColdDrinkBuilder() {
        super();
    }

    @Override
    public ProductBuilder setType() {
        this.type = "Drink";
        return this;
    }

    @Override
    public ProductBuilder setTemp() {
        this.temp = "Cold";
        return this;
    }

    @Override
    public Product build() {
        return new Product(type, temp);
    }
}
