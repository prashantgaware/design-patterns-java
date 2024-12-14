package dp.bill_pugh_singleton;

/**
 * The Bill Pugh Singleton approach is a thread-safe and efficient way to implement the Singleton Design
 * Pattern in Java. It uses a nested static helper class to lazily initialize the Singleton instance.
 *
 * 3. Key Features of the Bill Pugh Singleton Class
 * Lazy Initialization:
 * The Singleton instance is not created until it is accessed for the first time,
 * ensuring efficient resource utilization.
 *
 * Thread Safety:
 * The use of a static nested helper class ensures that the Singleton instance is created in a
 * thread-safe manner without the need for explicit synchronization.
 *
 * Efficient:
 * Unlike traditional approaches that use synchronized methods or blocks, this implementation
 * avoids performance overhead.
 */

public class PrinterUtils {

    public PrinterUtils() {
        System.out.println("PrinterUtils.PrinterUtils");
    }

    /**
     * The nested class is not loaded into memory until it is referenced,
     * making it an ideal choice for lazy initialization.
     */
    private static class PrinterUtilsHelper {
        private static final PrinterUtils INSTANCE_PRINTER = new PrinterUtils();
    }

    public static PrinterUtils getInstance() {
        return PrinterUtilsHelper.INSTANCE_PRINTER;
    }
}
