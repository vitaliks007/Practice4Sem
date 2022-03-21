package com.Vitaliy.courses.task3.subtask2;

public class Pen extends Product{
    private int color;

    public Pen(int weight, int color) {
        super(weight, 10);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
