package com.Vitaliy.task6.builder;

public interface ProductBuilder {
    public ProductBuilder setType();
    public ProductBuilder setTemp();
    public Product build();
}
