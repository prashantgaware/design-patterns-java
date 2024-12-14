package dp.reflection_api_solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// TODO : using reflection api, we can even access private properties of a class.

/**
 * this approach is breaking singleton behaviour.
 * Solution 1 : to restrict this, we can throw an exception from the constructor if the instance is already created.
 * Solution 2 : Enum based solution
 */
public class ReflectionAPITest_Solution {
    public static void main(String[] args) {
        try {
            // Load the class
            Class<?> c = Class.forName("dp.reflection_api_solution.Printer");

            // Get the constructors of the class
            Constructor constructors[] = c.getDeclaredConstructors();

            // Access the private constructor
            constructors[0].setAccessible(true);

            // Create the instance of the class
            Printer p = Printer.getInstance();
            Printer p1 = (Printer) constructors[0].newInstance();
            Printer p2 = (Printer) constructors[0].newInstance();
            // Here we are creating another object, so it will throw an exception.
            Printer p3 = Printer.getInstance();

            // Here, p1 and p2 are two different objects.
            // the reason being is, when we create an object using reflection api, a new object is created.
            System.out.println(p.hashCode() + " && " + p1.hashCode() + " && " + p2.hashCode() + " && " + p3.hashCode());

            System.out.println("p == p1 : " + (p == p1));
            System.out.println("p1 == p2 : " + (p1 == p2));
            System.out.println("p == p2 : " + (p == p2));
            System.out.println("p == p3 : " + (p == p3));

        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
