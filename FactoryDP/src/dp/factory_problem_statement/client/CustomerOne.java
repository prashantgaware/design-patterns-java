package dp.factory_problem_statement.client;

import dp.factory_problem_statement.BudgetCar;
import dp.factory_problem_statement.Car;

public class CustomerOne {
    public static void main(String[] args) {
        Car budgetCar = new BudgetCar();
        budgetCar.assemble();
        budgetCar.roadTest();
        budgetCar.drive();
    }
}
