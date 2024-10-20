package dp.factory_method_dp_problem.factory;

import dp.factory_method_dp_problem.bike.BajajBike;
import dp.factory_method_dp_problem.bike.Discover;
import dp.factory_method_dp_problem.bike.Platina;
import dp.factory_method_dp_problem.bike.Pulsar;

public class ChennaiFactory {

    public static BajajBike createBike(String bikeModel) {
        BajajBike bike = null;
        if(bikeModel.equals("pulsar")) {
            bike = new Pulsar();
        } else if(bikeModel.equals("platina")) {
            bike = new Platina();
        } else if(bikeModel.equals("discover")) {
            bike = new Discover();
        }
        assert bike != null;
        bike.painting();
        bike.assembling();
        // here chennai factory is not doing engine test
        // so leading to inconsistent behavior
        // this is problem in factory method design pattern
        // to overcome this problem we can use superclass that defines the standards for factories to create the objects for
        // the same family objects
//        bike.engineTest();
        bike.roadTest();

        return bike;
    }
}
