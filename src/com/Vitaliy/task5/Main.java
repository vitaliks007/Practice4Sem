package com.Vitaliy.task5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.printIns();
        lazySingleton = LazySingleton.getInstance();
        lazySingleton.printIns();

        DemandSingleton demandSingleton = DemandSingleton.getInstance();
        demandSingleton.printIns();
        demandSingleton = DemandSingleton.getInstance();
        demandSingleton.printIns();

        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE);
    }
}
