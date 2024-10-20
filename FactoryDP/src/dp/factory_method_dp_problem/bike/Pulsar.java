package dp.factory_method_dp_problem.bike;

public class Pulsar implements BajajBike{
    public Pulsar() {
        System.out.println("Pulsar bike is created");
    }

    @Override
    public void painting() {
        System.out.println("Pulsar.painting");
    }

    @Override
    public void roadTest() {
        System.out.println("Pulsar.roadTest");
    }

    @Override
    public void assembling() {
        System.out.println("Pulsar.assembling");
    }

    @Override
    public void engineTest() {
        System.out.println("Pulsar.engineTest");
    }

    @Override
    public void drive() {
        System.out.println("Pulsar.drive");
    }
}
