package dp.factory_method_dp_solution.factory;

import dp.factory_method_dp_solution.bike.BajajBike;
import dp.factory_method_dp_solution.bike.Discover;
import dp.factory_method_dp_solution.bike.Platina;
import dp.factory_method_dp_solution.bike.Pulsar;
import dp.factory_method_dp_solution.factory_method.BikeFactory;

public class NagpurFactory extends BikeFactory {

    @Override
    public BajajBike createBike(String type) {
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

        return bike;
    }

    @Override
    public void painting() {
        System.out.println("NagpurFactory.painting");
    }

    @Override
    public void roadTest() {
        System.out.println("NagpurFactory.roadTest");
    }

    @Override
    public void assembling() {
        System.out.println("NagpurFactory.assembling");
    }

    @Override
    public void engineTest() {
        System.out.println("NagpurFactory.engineTest");
    }
}
