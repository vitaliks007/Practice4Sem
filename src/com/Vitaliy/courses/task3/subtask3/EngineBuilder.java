package com.Vitaliy.courses.task3.subtask3;

public class EngineBuilder implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Двигатель создан");
        return new Engine();
    }
}
