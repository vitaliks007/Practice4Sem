package com.Vitaliy.task6.builder;

public class HotFishBuilder implements ProductBuilder {
    private String type;
    private String temp;

    public HotFishBuilder() {
        super();
    }

    @Override
    public ProductBuilder setType() {
        this.type = "Fish";
        return this;
    }

    @Override
    public ProductBuilder setTemp() {
        this.temp = "Hot";
        return this;
    }

    @Override
    public Product build() {
        return new Product(type, temp);
    }
}
