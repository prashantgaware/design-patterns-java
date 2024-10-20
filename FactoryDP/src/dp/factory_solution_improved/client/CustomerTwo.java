package dp.factory_solution_improved.client;

import dp.factory_solution_improved.factory.CarFactory;
import dp.factory_solution_improved.factory.ICarType;
import dp.factory_solution_improved.models.Car;

public class CustomerTwo {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(ICarType.MODE_SPORTS);
        car.drive();
    }
}
