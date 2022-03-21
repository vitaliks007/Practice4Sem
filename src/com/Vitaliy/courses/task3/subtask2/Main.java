package com.Vitaliy.courses.task3.subtask2;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(new Pen(100, 1), new Pencil(80, 1, 2));
        storage.add(new Workbook(700, 3, 48));
        storage.add(new Pen(110, 2));
        System.out.println(storage.weight());
    }
}
