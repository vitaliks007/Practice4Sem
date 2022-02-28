package com.Vitaliy.task5;

public class DemandSingleton {
    public DemandSingleton() {
    }

    private static class SingletonHolder {
        private final static DemandSingleton instance = new DemandSingleton();
    }

    public static DemandSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public void printIns() {
        System.out.println(this);
    }
}
