package dp.factory_solution_improved.client;

import dp.factory_solution_improved.factory.CarFactory;
import dp.factory_solution_improved.factory.ICarType;
import dp.factory_solution_improved.models.Car;

public class CustomerOne {
    public static void main(String[] args) {
        /**
         * Here we are getting the car object from the factory and calling the drive method.
         * The client is not aware of the concrete class and the client is not responsible for creating the object.
         * The factory is responsible for creating the object.
         * This is the Factory Design Pattern.
         */
        Car car = CarFactory.getCar(ICarType.MODE_BUDGET);
        car.drive();
    }
}
