package com.Vitaliy.task5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton = new LazySingleton();
        lazySingleton.printIns();
        lazySingleton = new LazySingleton();
        lazySingleton.printIns();

        DemandSingleton demandSingleton = new DemandSingleton();
        demandSingleton.printIns();
        demandSingleton = new DemandSingleton();
        demandSingleton.printIns();

        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE);
    }
}
