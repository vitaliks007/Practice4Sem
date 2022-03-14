package com.Vitaliy.task7.linker;

public class Main {
    public static void main(String[] args) {
        SubCostCounter subCostCounter = new CostCounter();

        SubCostCounter a = new CostCounter(new Fish(2000, 1000), new Fish(1500, 900));
        SubCostCounter b = new CostCounter(new Fish(3000, 100), new Fish(1000, 1000));

        subCostCounter.add(new Fish(500, 100));
        subCostCounter.add(a);
        subCostCounter.add(b);
        subCostCounter.remove(a);

        System.out.println(subCostCounter.cost());
    }
}
