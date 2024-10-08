package dp.enum_solution;

public class PrinterTicketBookingMultithreadingTest {
    public static void main(String[] args) {

            TicketBooking operation = new TicketBooking();
            Thread th1 = new Thread(operation);
            Thread th2 = new Thread(operation);
            Thread th3 = new Thread(operation);

            th1.start();
            th2.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            th3.start();
    }
}
