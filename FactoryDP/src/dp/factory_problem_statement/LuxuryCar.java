package dp.factory_problem_statement;

public class LuxuryCar extends Car{
    private String bootspace;
    private String airConditioning;

    public LuxuryCar() {
        System.out.println("LuxuryCar.LuxuryCar");
    }

    @Override
    public void assemble() {
        System.out.println("LuxuryCar.assemble");
    }

    @Override
    public void roadTest() {
        System.out.println("LuxuryCar.roadTest");
    }

    @Override
    public void drive() {
        System.out.println("LuxuryCar.drive");
    }
}
