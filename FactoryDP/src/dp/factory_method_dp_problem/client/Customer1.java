package dp.factory_method_dp_problem.client;

import dp.factory_method_dp_problem.bike.BajajBike;
import dp.factory_method_dp_problem.factory.ChennaiFactory;

public class Customer1 {
    public static void main(String[] args) {
        // Here we are getting the bike object from the factory and calling the painting method.
        // The client is not aware of the concrete class and the client is not responsible for creating the object.
        // The factory is responsible for creating the object.
        // This is the Factory Design Pattern.
        BajajBike bike = ChennaiFactory.createBike("pulsar");
        bike.drive();
    }
}
