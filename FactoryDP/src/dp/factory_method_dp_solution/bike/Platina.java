package dp.factory_method_dp_solution.bike;

public class Platina implements BajajBike {
    public Platina() {
        System.out.println("Platina bike is created");
    }

    @Override
    public void drive() {
        System.out.println("Platina.drive");
    }
}
