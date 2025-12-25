package ocp;

public class Printer {
    private Invoice invoice;

    public Printer(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Invoice Details:");
        // Print invoice details
    }
}
