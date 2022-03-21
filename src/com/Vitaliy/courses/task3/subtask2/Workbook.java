package com.Vitaliy.courses.task3.subtask2;

public class Workbook extends Product{
    private int type;
    private int size;

    public Workbook(int weight, int type, int size) {
        super(weight, 50);
        this.type = type;
        this.size = size;
    }
}
