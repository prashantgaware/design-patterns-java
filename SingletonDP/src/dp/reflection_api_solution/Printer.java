package dp.reflection_api_solution;

public class Printer {
    // This is the instance of the Printer class.
    private static Printer INSTANCE = null;
    // This is used to check if the instance is created or not.
    // If the instance is created, then we will throw an exception.
    boolean isInstanceCreated = false;

    private Printer() {
        /*if (INSTANCE != null) {
            throw new RuntimeException("Cannot create instance of this class");
        }*/
        if (isInstanceCreated) {
            throw new RuntimeException("Cannot create instance of this class");
        } else
            isInstanceCreated = true;

        System.out.println("Printer instance created");
    }

    /**
     * This method is used to get the instance of the Printer class.
     * @return Printer
     */
    public static Printer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Printer();
        }

        return INSTANCE;
    }
}
