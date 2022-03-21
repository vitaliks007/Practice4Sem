package com.Vitaliy.task7.facade;

import java.util.ArrayList;

public class RandomCounter {
    public void countSumOfRandoms(int count, int minValue, int maxValue) {
        ArrayList<Integer> values = new ArrayList<>();
        int result;

        for (int i = 0; i < count; i++) {
            values.add(Randomizer.getRandom(minValue, maxValue));
        }
        result = Counter.count(values);
        Printer.print(result);
    }
}
