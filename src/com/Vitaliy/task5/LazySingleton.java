package com.Vitaliy.task5;

public class LazySingleton {
    private LazySingleton instance;
    public synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
            return instance;
        }
        return instance;
    }

    public void printIns() {
        System.out.println(this);
    }
}
