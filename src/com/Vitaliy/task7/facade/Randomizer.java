package com.Vitaliy.task7.facade;

import java.util.Map;

public class Randomizer {
    public static int getRandom(int minValue, int maxValue) {
        return (int)(Math.random() * ((maxValue - minValue) + 1)) + minValue;
    }
}
