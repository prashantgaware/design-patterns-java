package dp.factory_method_dp_solution.factory;

import dp.factory_method_dp_solution.bike.BajajBike;
import dp.factory_method_dp_solution.bike.Discover;
import dp.factory_method_dp_solution.bike.Platina;
import dp.factory_method_dp_solution.bike.Pulsar;
import dp.factory_method_dp_solution.factory_method.BikeFactory;

public class ChennaiFactory extends BikeFactory {

    @Override
    public void painting() {
        System.out.println("ChennaiFactory.painting");
    }

    @Override
    public void roadTest() {
        System.out.println("ChennaiFactory.roadTest");
    }

    @Override
    public void assembling() {
        System.out.println("ChennaiFactory.assembling");
    }

    @Override
    public void engineTest() {
        System.out.println("ChennaiFactory.engineTest");
    }

    public BajajBike createBike(String bikeModel) {
        BajajBike bike = null;
        if(bikeModel.equals("pulsar")) {
            bike = new Pulsar();
        } else if(bikeModel.equals("platina")) {
            bike = new Platina();
        } else if(bikeModel.equals("discover")) {
            bike = new Discover();
        }

        return bike;
    }
}
