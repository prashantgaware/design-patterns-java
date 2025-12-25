package srp.problem;

public class Marker {
    private String color;
    private String price;
    private String name;

    public Marker(String color, String price, String name) {
        this.color = color;
        this.price = price;
        this.name = name;
    }

    public void invoice() {
        System.out.println("Invoice for Marker:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public void calculatePrice() {
        System.out.println("Calculating price for Marker: " + name);
        // Price calculation logic here
    }

    public void saveToDb() {
        System.out.println("Saving Marker to database: " + name);
        // Database saving logic here
    }
}
