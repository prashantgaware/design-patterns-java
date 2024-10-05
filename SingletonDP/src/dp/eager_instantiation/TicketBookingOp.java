package dp.eager_instantiation;

public class TicketBookingOp implements Runnable {

    @Override
    public void run() {
        System.out.println("TicketBookingOp.run");
//        PrinterUtils printerUtils = PrinterUtils.getInstance1();
//        System.out.println(printerUtils.hashCode());

        PrinterUtils1 printerUtils1 = PrinterUtils1.getInstance1();
        System.out.println(printerUtils1.hashCode());
    }
}
