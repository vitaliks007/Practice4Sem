package com.Vitaliy.courses.task3.subtask3;

public class Car implements IProduct {
    private IProductPart body;
    private IProductPart chassis;
    private IProductPart engine;

    @Override
    public void installFirstPart(IProductPart iProductPart) {
        System.out.println("Корпус установлен");
        this.body = iProductPart;
    }

    @Override
    public void installSecondPart(IProductPart iProductPart) {
        System.out.println("Шасси установлено");
        this.chassis = iProductPart;
    }

    @Override
    public void installThirdPart(IProductPart iProductPart) {
        System.out.println("Двигатель установлен");
        this.engine = iProductPart;
    }
}
