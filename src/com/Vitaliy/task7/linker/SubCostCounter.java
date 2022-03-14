package com.Vitaliy.task7.linker;

public interface SubCostCounter {
    int cost();

    void add(SubCostCounter subCostCounter);
    void remove(SubCostCounter subCostCounter);
    SubCostCounter getChild(int index);
}
