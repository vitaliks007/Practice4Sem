package com.Vitaliy.courses.task3.subtask3;

public class BodyBuilder implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Корпус создан");
        return new Body();
    }
}
