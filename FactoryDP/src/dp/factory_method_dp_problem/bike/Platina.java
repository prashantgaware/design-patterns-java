package dp.factory_method_dp_problem.bike;

public class Platina implements BajajBike{
    public Platina() {
        System.out.println("Platina bike is created");
    }

    @Override
    public void painting() {
        System.out.println("Platina.painting");
    }

    @Override
    public void roadTest() {
        System.out.println("Platina.roadTest");
    }

    @Override
    public void assembling() {
        System.out.println("Platina.assembling");
    }

    @Override
    public void engineTest() {
        System.out.println("Platina.engineTest");
    }

    @Override
    public void drive() {
        System.out.println("Platina.drive");
    }
}
