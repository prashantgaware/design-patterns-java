package dp.factory_method_dp_problem.factory;

import dp.factory_method_dp_problem.bike.BajajBike;
import dp.factory_method_dp_problem.bike.Discover;
import dp.factory_method_dp_problem.bike.Platina;
import dp.factory_method_dp_problem.bike.Pulsar;

public class NagpurFactory {

    public static BajajBike createBajajBike(String type) {
        BajajBike bike = null;
        if (type.equals("pulsar")) {
            bike = new Pulsar();
        } else if (type.equals("platina")) {
            bike = new Platina();
        } else if (type.equals("discover")) {
            bike = new Discover();
        } else {
            System.out.println("Invalid bike type");
        }

        assert bike != null;
        bike.painting();
        bike.assembling();
        bike.engineTest();
        bike.roadTest();

        return bike;
    }
}
