package dp.factory_method_dp_solution.bike;

public class Pulsar implements BajajBike {
    public Pulsar() {
        System.out.println("Pulsar bike is created");
    }

    @Override
    public void drive() {
        System.out.println("Pulsar.drive");
    }
}
