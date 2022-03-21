package com.Vitaliy.task7.facade;

import java.util.ArrayList;

public class Counter {
    public static int count(ArrayList<Integer> values) {
        return values.stream().reduce(0, Integer::sum);
    }
}
