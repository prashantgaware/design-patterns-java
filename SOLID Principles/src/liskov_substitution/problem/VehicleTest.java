package liskov_substitution.problem;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {
    public static void main(String[] args) {
        List<Vehicle> v = new ArrayList<>();
        v.add(new MotorCycle());
        v.add(new Car());
        v.add(new Bicycle());

        for (Vehicle vehicle : v) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
