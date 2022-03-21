package com.Vitaliy.courses.task3.subtask3;

public class ChassisBuilder implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Шасси создано");
        return new Chassis();
    }
}
