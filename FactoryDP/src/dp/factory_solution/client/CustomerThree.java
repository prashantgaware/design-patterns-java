package dp.factory_solution.client;

import dp.factory_solution.factory.CarFactory;
import dp.factory_solution.models.Car;

public class CustomerThree {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Luxury");
        car.drive();
    }
}
