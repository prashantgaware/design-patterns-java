package dp.min_standards;

public class PrinterUtils {

    private static PrinterUtils INSTANCE = null;

    private PrinterUtils() {
        System.out.println("PrinterUtils instance created");
    }

    public static PrinterUtils getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrinterUtils();
        }

        return INSTANCE;
    }
}
