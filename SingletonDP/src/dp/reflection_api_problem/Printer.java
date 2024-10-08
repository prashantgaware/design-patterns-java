package dp.reflection_api_problem;

public class Printer {
    // This is the instance of the Printer class.
    private final static Printer INSTANCE = null;

    /**
     * This constructor is used to create the instance of the Printer class.
     */
    private Printer() {
        System.out.println("Printer instance created");
    }

    /**
     * This method is used to get the instance of the Printer class.
     * @return Printer
     */
    public static Printer getInstance() {
        if (INSTANCE == null) {
            return new Printer();
        }

        return INSTANCE;
    }
}
