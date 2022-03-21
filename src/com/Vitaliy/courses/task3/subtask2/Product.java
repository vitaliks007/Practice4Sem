package com.Vitaliy.courses.task3.subtask2;

public abstract class Product {
    private int weight;
    private int volume;

    public Product(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }
}
