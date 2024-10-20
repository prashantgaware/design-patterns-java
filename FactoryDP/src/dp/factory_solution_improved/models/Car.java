package dp.factory_solution_improved.models;

public abstract class Car {
    public int engineId;
    public int registrationId;

    public abstract void assemble();
    public abstract void roadTest();
    public abstract void drive();
}
