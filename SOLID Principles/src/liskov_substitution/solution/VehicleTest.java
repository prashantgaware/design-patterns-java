package liskov_substitution.solution;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new MotorCycle());
        list.add(new Car());
        list.add(new Bicycle());

        for (Vehicle v : list)
            System.out.println(v.getNumberOfWheels().toString());

        List<EngineVehicle> engineList = new ArrayList<>();
        engineList.add(new MotorCycle());
        engineList.add(new Car());
//        engineList.add(new Bicycle());
        // Not able to add it bcos EngineVehicle has not been implemented by Bicycle

        for (EngineVehicle v : engineList) {
            System.out.println(v.hasEngine().toString());
            System.out.println(v.getNumberOfWheels().toString());
        }

    }
}
