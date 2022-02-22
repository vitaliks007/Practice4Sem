package com.Vitaliy.task3;

public class Main {
    static volatile ListSafe<Integer> list = new ListSafe<>();
    static void increment(ListSafe<Integer> list) {
        list.set(0, (int)list.get(0) + 1);
    }

    static volatile SetSafe<Integer> set = new SetSafe<>();
    static void increment(SetSafe<Integer> set) {
        int o = -100;

        for (Object elem : set) {
            o = (int)elem + 1;
        }
        set.clear();
        set.add(o);
    }

    static void listTest() throws InterruptedException {
        list.add(0);

        Thread one = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment(list);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment(list);
            }
        });
        one.start();
        two.start();
        Thread.sleep(1000);

        System.out.println(list);
    }

    static void setTest() throws InterruptedException {
        set.add(0);

        Thread one = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment(set);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment(set);
            }
        });
        one.start();
        two.start();
        Thread.sleep(1000);

        System.out.println(set);
    }

    public static void main(String[] args) throws InterruptedException {
        listTest();
        setTest();
    }
}
