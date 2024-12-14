package liskov_substitution.problem;

public class Bicycle extends Vehicle {
    @Override
    public Boolean hasEngine() {
        return null;
    }

    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Boolean.toString()"
    // because the return value of "liskov_substitution.problem.Vehicle.hasEngine()" is null
    // which is breaking th code.
}
