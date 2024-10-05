package dp.multithreading;

public class TicketBookingOp implements Runnable {

    @Override
    public void run() {
        System.out.println("TicketBookingOp.run");
        PrinterUtils printerUtils = PrinterUtils.getInstance1();
        System.out.println(printerUtils.hashCode());
        System.out.println();
        PrinterUtils printerUtils1 = PrinterUtils.getInstance2();
        System.out.println(printerUtils1.hashCode());






//        PrinterUtils printerUtils1 = PrinterUtils.getInstance1();
        /*PrinterUtils printerUtils2 = PrinterUtils.getInstance1();
        PrinterUtils printerUtils3 = PrinterUtils.getInstance1();

        System.out.println(printerUtils1.hashCode() + " && " + printerUtils2.hashCode() + " && " + printerUtils3.hashCode());
        System.out.println("printerUtils1 == printerUtils2 : " + (printerUtils1 == printerUtils2));
        System.out.println("printerUtils2 == printerUtils3 : " + (printerUtils2 == printerUtils3));
        System.out.println("printerUtils1 == printerUtils3 : " + (printerUtils1 == printerUtils3));*/

//        PrinterUtils printerUtils4 = PrinterUtils.getInstance2();
        /*PrinterUtils printerUtils5 = PrinterUtils.getInstance2();
        PrinterUtils printerUtils6 = PrinterUtils.getInstance2();

        System.out.println(printerUtils4.hashCode() + " && " + printerUtils5.hashCode() + " && " + printerUtils6.hashCode());
        System.out.println("printerUtils4 == printerUtils5 : " + (printerUtils4 == printerUtils5));
        System.out.println("printerUtils5 == printerUtils6 : " + (printerUtils5 == printerUtils6));
        System.out.println("printerUtils4 == printerUtils6 : " + (printerUtils4 == printerUtils6));*/

        /*System.out.println();
        System.out.println(printerUtils1.hashCode() + " && " + printerUtils4.hashCode());
        System.out.println("printerUtils1 == printerUtils4 : " + (printerUtils1 == printerUtils4));*/
    }

}
