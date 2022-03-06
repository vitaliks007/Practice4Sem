package com.Vitaliy.task6.builder;

public class ProductDirector {
    private ProductBuilder builder;

    public ProductDirector(ProductBuilder builder) {
        super();
        this.builder = builder;
    }

    public Product createProduct() {
        return builder.setType().setTemp().build();
    }
}
