package dp.bill_pugh_singleton;

public class TicketBookingOp implements Runnable {

    @Override
    public void run() {
        System.out.println("TicketBookingOp.run");
        PrinterUtils p1 = PrinterUtils.getInstance();
        PrinterUtils p2 = PrinterUtils.getInstance();

        System.out.println("P1 : " + p1.hashCode() + " :: p2 : " + p2.hashCode());
    }
}
