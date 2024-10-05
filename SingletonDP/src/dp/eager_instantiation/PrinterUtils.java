package dp.eager_instantiation;

/**
 * Since the instance is created at the time of class loading, this is called eager instantiation.
 * so the static method call returns the same instance every time without checking the null condition.
 * there is no possibility of thread switching in side static factory method.
 */

// TODO : Limitations
/**
 * 1. The instance is created at the time of class loading, so
 *   if the instance is not required at all, then it is unnecessary to create the instance.
 *   This is called unnecessary memory allocation.
 */
public class PrinterUtils {
    private static final PrinterUtils INSTANCE = new PrinterUtils();

    private PrinterUtils() {
        System.out.println("PrinterUtils instance created");
    }

    public static PrinterUtils getInstance1() {
        return INSTANCE;
    }

    public String print(String message) {
        return message;
    }
}
