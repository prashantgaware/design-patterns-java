package dp.enum_solution;

public enum Printer {
    // This is the instance of the Printer class.
    // public static Printer INSTANCE; ==> This is the insternal of the enum class.
    INSTANCE;

    public static Printer getInstance() {
        return INSTANCE;
    }

    public void print(String message) {
        System.out.println(message);
    }
}
