package com.Vitaliy.task7.linker;

public class Fish extends Product implements SubCostCounter {
    private static final String name = "Fish";
    private int weight;

    public Fish(int cost, int weight) {
        super(cost);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int cost() {
        return this.getCost();
    }

    @Override
    public void add(SubCostCounter subCostCounter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(SubCostCounter subCostCounter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SubCostCounter getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
