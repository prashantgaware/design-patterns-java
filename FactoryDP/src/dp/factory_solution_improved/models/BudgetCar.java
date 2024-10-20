package dp.factory_solution_improved.models;

public class BudgetCar extends Car {
    private String fuelEconomy;
    private float price;

    public BudgetCar() {
        System.out.println("BudgetCar.BudgetCar");
    }

    @Override
    public void assemble() {
        System.out.println("BudgetCar.assemble");
    }

    @Override
    public void roadTest() {
        System.out.println("BudgetCar.roadTest");
    }

    @Override
    public void drive() {
        System.out.println("BudgetCar.drive");
    }
}
