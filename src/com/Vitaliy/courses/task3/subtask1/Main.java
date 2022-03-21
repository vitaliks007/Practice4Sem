package com.Vitaliy.courses.task3.subtask1;

public class Main {
    public static void main(String[] args) {
        int x = (new java.util.Random()).nextInt(900) + 99;
        int sum = Integer.toString(x).chars().map(Character::getNumericValue).sum();
        System.out.println(x);
        System.out.println(sum);
    }
}
