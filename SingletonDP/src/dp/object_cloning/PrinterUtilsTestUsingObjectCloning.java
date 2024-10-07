package dp.object_cloning;

public class PrinterUtilsTestUsingObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Printer p1 = Printer.getInstance();
        Printer p2 = (Printer) p1.clone();

        // Here,
        // p1 and p2 are two different objects.
        // p1 and p2 have different hashcodes.
        // the reason behind this is, when we clone an object, a new object is created.
        System.out.println(p1.hashCode() + " && " + p2.hashCode());
        System.out.println("p1 == p2 : " + (p1 == p2));

        /**
         * To stop cloning of an object, we can override the clone() method in the class and throw CloneNotSupportedException.
         * 1. Override clone() in singleton class and return already created instance.
         * 2. Override clone() in singleton class and throw CloneNotSupportedException.
         * 3. Develop Enum based singleton class.
         */

    }
}
