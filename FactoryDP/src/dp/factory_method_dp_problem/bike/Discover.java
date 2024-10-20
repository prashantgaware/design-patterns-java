package dp.factory_method_dp_problem.bike;

public class Discover implements BajajBike{
    public Discover() {
        System.out.println("Discover bike is created");
    }

    @Override
    public void painting() {
        System.out.println("Discover.painting");
    }

    @Override
    public void roadTest() {
        System.out.println("Discover.roadTest");
    }

    @Override
    public void assembling() {
        System.out.println("Discover.assembling");
    }

    @Override
    public void engineTest() {
        System.out.println("Discover.engineTest");
    }

    @Override
    public void drive() {
        System.out.println("Discover.drive");
    }
}
