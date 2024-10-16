package dp.factory_problem_statement.client;

import dp.factory_problem_statement.Car;
import dp.factory_problem_statement.SportsCar;

public class CustomerTwo {
    public static void main(String[] args) {
        // this approach is not good because the client is aware of the concrete class
        // and the client is responsible for creating the object
        Car sportsCar = new SportsCar();
        sportsCar.assemble();
        sportsCar.roadTest();
        sportsCar.drive();
    }
}
