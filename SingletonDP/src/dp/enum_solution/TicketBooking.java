package dp.enum_solution;

public class TicketBooking implements Runnable {

    @Override
    public void run() {
        System.out.println("TicketBooking.run");
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();
        System.out.println(printer1.hashCode() + " && " + printer2.hashCode());
        System.out.println("printer1 == printer2 : " + (printer1 == printer2));
    }
}
