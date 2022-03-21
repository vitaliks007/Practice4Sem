package com.Vitaliy.courses.task3.subtask3;

public class AssemblyLine implements IAssemblyLine {
    @Override
    public IProduct assembleProduct(IProduct car) {
        ILineStep iLineStep = new BodyBuilder();
        car.installFirstPart(iLineStep.buildProductPart());

        iLineStep = new ChassisBuilder();
        car.installSecondPart(iLineStep.buildProductPart());

        iLineStep = new EngineBuilder();
        car.installThirdPart(iLineStep.buildProductPart());

        System.out.println("Машина собрана");
        return car;
    }
}
