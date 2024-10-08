package dp.reflection_api_problem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// TODO : using reflection api, we can even access private properties of a class.

/**
 * this approach is breaking singleton behaviour.
 * to restrict this, we can throw an exception from the constructor if the instance is already created.
 */
public class ReflectionAPITest_Problem {
    public static void main(String[] args) {
        try {
            // Load the class
            Class<?> c = Class.forName("dp.reflection_api_problem.Printer");

            // Get the constructors of the class
            Constructor constructors[] = c.getDeclaredConstructors();

            // Access the private constructor
            constructors[0].setAccessible(true);

            // Create the instance of the class
            Printer p1 = (Printer) constructors[0].newInstance();
            Printer p2 = (Printer) constructors[0].newInstance();

            // Here, p1 and p2 are two different objects.
            // the reason being is, when we create an object using reflection api, a new object is created.
            System.out.println(p1.hashCode() + " && " + p2.hashCode());
            System.out.println("p1 == p2 : " + (p1 == p2));

        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
