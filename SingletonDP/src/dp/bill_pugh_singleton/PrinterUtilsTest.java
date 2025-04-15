package dp.bill_pugh_singleton;

//import dp.eager_instantiation.TicketBookingOp;

public class PrinterUtilsTest {

    public static void main(String[] args) {
        TicketBookingOp operation = new TicketBookingOp();
        Thread th1 = new Thread(operation);
        Thread th2 = new Thread(operation);
        Thread th3 = new Thread(operation);

        th1.start();
        th2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        th3.start();
    }

}
