package liskov_substitution.solution;

public class Car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
