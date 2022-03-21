package com.Vitaliy.courses.task3.subtask2;

public class Pencil extends Product{
    private int type;
    private int color;

    public Pencil(int weight, int type, int color) {
        super(weight, 9);
        this.type = type;
        this.color = color;
    }
}
