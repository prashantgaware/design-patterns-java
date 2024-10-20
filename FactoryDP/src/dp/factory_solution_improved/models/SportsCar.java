package dp.factory_solution_improved.models;

public class SportsCar extends Car {
    private String speed;
    private float pickup;

    public SportsCar() {
        System.out.println("SportsCar.SportsCar");
    }

    @Override
    public void assemble() {
        System.out.println("SportsCar.assemble");
    }

    @Override
    public void roadTest() {
        System.out.println("SportsCar.roadTest");
    }

    @Override
    public void drive() {
        System.out.println("SportsCar.drive");
    }
}
