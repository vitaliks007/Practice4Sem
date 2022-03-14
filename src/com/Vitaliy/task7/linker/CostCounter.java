package com.Vitaliy.task7.linker;

import java.util.ArrayList;
import java.util.Arrays;

public class CostCounter implements SubCostCounter{
    private ArrayList<SubCostCounter> counters;

    public CostCounter(SubCostCounter ... counters) {
        this.counters = new ArrayList<>();
        this.counters.addAll(Arrays.asList(counters));
    }

    @Override
    public int cost() {
        return counters.stream().mapToInt(SubCostCounter::cost).sum();
    }

    @Override
    public void add(SubCostCounter counter) {
        counters.add(counter);
    }

    @Override
    public void remove(SubCostCounter counter) {
        counters.remove(counter);
    }

    @Override
    public SubCostCounter getChild(int index) {
        return counters.get(index);
    }
}
