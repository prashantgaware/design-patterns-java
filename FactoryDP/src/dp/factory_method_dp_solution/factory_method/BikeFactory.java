package dp.factory_method_dp_solution.factory_method;

import dp.factory_method_dp_solution.bike.BajajBike;
import dp.factory_method_dp_solution.bike.Discover;
import dp.factory_method_dp_solution.bike.Platina;
import dp.factory_method_dp_solution.bike.Pulsar;

public abstract class BikeFactory {
    public abstract void painting();
    public abstract void roadTest();
    public abstract void assembling();
    public abstract void engineTest();

    public abstract BajajBike createBike(String type);

    public BajajBike orderBike(String type) {
        BajajBike bike = createBike(type);
        assert bike != null;
        painting();
        assembling();
        engineTest();
        roadTest();
        return bike;
    }

}
