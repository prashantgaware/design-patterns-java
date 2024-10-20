package dp.factory_method_dp_solution.bike;

public class Discover implements BajajBike {
    public Discover() {
        System.out.println("Discover bike is created");
    }

    @Override
    public void drive() {
        System.out.println("Discover.drive");
    }
}
