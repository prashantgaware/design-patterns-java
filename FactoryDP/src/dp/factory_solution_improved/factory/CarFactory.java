package dp.factory_solution_improved.factory;

import dp.factory_solution_improved.models.BudgetCar;
import dp.factory_solution_improved.models.Car;
import dp.factory_solution_improved.models.LuxuryCar;
import dp.factory_solution_improved.models.SportsCar;

/**
 * CarFactory
 * Instead of creating objects of Car classes directly, we are using a factory class to create objects.
 * This class is responsible for creating objects of Car classes based on the input provided.
 */
public class CarFactory {
    public static Car getCar(String carType) {
        Car car = null;
        if (carType.equalsIgnoreCase(ICarType.MODE_LUXURY)) {
            car = new LuxuryCar();
        } else if (carType.equalsIgnoreCase(ICarType.MODE_SPORTS)) {
            car = new SportsCar();
        } else if (carType.equalsIgnoreCase(ICarType.MODE_BUDGET)) {
            car = new BudgetCar();
        } else
            throw new IllegalArgumentException("Invalid car type: " + carType);

        car.assemble();
        car.roadTest();

        return car;
    }
}
