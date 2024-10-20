package dp.factory_method_dp_solution.client;

import dp.factory_method_dp_solution.bike.BajajBike;
import dp.factory_method_dp_solution.factory.ChennaiFactory;
import dp.factory_method_dp_solution.factory_method.BikeFactory;

public class Customer1 {
    public static void main(String[] args) {

        BikeFactory factory = new ChennaiFactory();
        BajajBike bike = factory.orderBike("pulsar");
        bike.drive();
    }
}
