package dp.multithreading;

public class PrinterUtilsTest {
    public static void main(String[] args) {

        TicketBookingOp operation = new TicketBookingOp();
        Thread th1 = new Thread(operation);
        Thread th2 = new Thread(operation);
        Thread th3 = new Thread(operation);

        th1.start();
        th2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.start();
    }
}