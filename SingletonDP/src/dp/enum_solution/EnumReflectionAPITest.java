package dp.enum_solution;

import java.lang.reflect.Constructor;

public class EnumReflectionAPITest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("dp.enum_solution.Printer");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            constructors[0].setAccessible(true);
            Printer printer1 = Printer.getInstance();
            Printer printer2 = (Printer) constructors[0].newInstance();
            Printer printer3 = (Printer) constructors[0].newInstance();

            System.out.println(printer1.hashCode() + " && " + printer2.hashCode() + " && " + printer3.hashCode());
            System.out.println("printer1 == printer2 : " + (printer1 == printer2));
            System.out.println("printer2 == printer3 : " + (printer2 == printer3));
            System.out.println("printer1 == printer3 : " + (printer1 == printer3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * Output:
         * 1163157884 && 1956725890 && 356573597
         * printer1 == printer2 : false
         * printer2 == printer3 : false
         * printer1 == printer3 : false
         *
         * Explanation:
         * 1. We are using reflection API to access the private constructor of the Printer class.
         * 2. We are creating 3 instances of the Printer class using reflection API.
         * 3. We are getting 3 different hash codes for the 3 instances.
         * 4. We are getting false for all the 3 comparisons.
         * 5. This is because we are creating 3 different instances of the Printer class using reflection API.
         * 6. This is breaking the singleton behaviour.
         * 7. To restrict this, we can throw an exception from the constructor if the instance is already created.
         */
    }
}
