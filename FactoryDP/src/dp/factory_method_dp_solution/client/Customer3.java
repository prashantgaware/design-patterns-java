package dp.factory_method_dp_solution.client;

import dp.factory_method_dp_solution.bike.BajajBike;
import dp.factory_method_dp_solution.factory.NagpurFactory;
import dp.factory_method_dp_solution.factory_method.BikeFactory;

public class Customer3 {
    public static void main(String[] args) {
        BikeFactory factory = new NagpurFactory();
        BajajBike bike = factory.orderBike("discover");
        bike.drive();
    }
}
