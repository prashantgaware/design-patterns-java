package srp.solution;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int invoice() {
        System.out.println("Invoice.invoice");
        System.out.println("Quantity: " + quantity);
        return quantity * marker.getPrice();
    }
}
