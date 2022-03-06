package com.Vitaliy.task6.prototype;

public class Drink extends Product{
    private int vol;

    public void setVol(int vol) {
        this.vol = vol;
    }

    public Drink() {
    }

    public Drink(Drink target) {
        super(target);
        this.vol = target.vol;
    }

    @Override
    public Drink clone() {
        return new Drink(this);
    }

    @Override
    public void printProduct() {
        System.out.println(this.getCost() + " " + vol);
    }
}
