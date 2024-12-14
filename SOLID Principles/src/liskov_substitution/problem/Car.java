package liskov_substitution.problem;

public class Car extends Vehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
