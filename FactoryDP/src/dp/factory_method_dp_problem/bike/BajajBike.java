package dp.factory_method_dp_problem.bike;

public interface BajajBike {
    // here all the methods are public and abstract by default
    // so exposed to client
    // so client can call any method. This is not good
    void painting();
    void roadTest();
    void assembling();
    void engineTest();
    void drive();
}
