package dp.min_standards;

public class PrinterUtilsTest {
    public static void main(String[] args) {
        PrinterUtils printerUtils1 = PrinterUtils.getInstance();
        PrinterUtils printerUtils2 = PrinterUtils.getInstance();
        PrinterUtils printerUtils3 = PrinterUtils.getInstance();

        System.out.println(printerUtils1.hashCode() + " && " + printerUtils2.hashCode() + " && " + printerUtils3.hashCode());
        System.out.println("printerUtils1 == printerUtils2 : " + (printerUtils1 == printerUtils2));
        System.out.println("printerUtils2 == printerUtils3 : " + (printerUtils2 == printerUtils3));
        System.out.println("printerUtils1 == printerUtils3 : " + (printerUtils1 == printerUtils3));
    }
}
