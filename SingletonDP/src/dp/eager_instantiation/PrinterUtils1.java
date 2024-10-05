package dp.eager_instantiation;

/**
 * Since the instance is created at the time of class loading, this is called eager instantiation.
 * so the static method call returns the same instance every time without checking the null condition.
 * there is no possibility of thread switching in side static factory method.
 */

// TODO : Notes
/**
 * 1. when Outer class is loaded, inner class is not loaded.
 * so no object is created at the time of class loading.
 * but when wecall getInstance1() method, inner class is loaded and
 * static property based instantiation is done for outer class.
 * On demand instantiation is done for inner class.
 * No thread switching is possible in this approach.
 */
public class PrinterUtils1 {

    /**
     * inner class based implementation of eager instantiation
     * but for outer class, it is lazy instantiation
     */
    private static class PrinterUtilsHelper {
        private static final PrinterUtils1 INSTANCE = new PrinterUtils1();
    }

    private PrinterUtils1() {
        System.out.println("PrinterUtils instance created");
    }

    public static PrinterUtils1 getInstance1() {
        return PrinterUtilsHelper.INSTANCE;
    }

    public String print(String message) {
        return message;
    }
}
