package dp.factory_problem_statement.client;

import dp.factory_problem_statement.Car;
import dp.factory_problem_statement.LuxuryCar;

public class CustomerThree {
    public static void main(String[] args) {
        Car luxuryCar = new LuxuryCar();
        luxuryCar.assemble();
        luxuryCar.roadTest();
        luxuryCar.drive();
    }
}
