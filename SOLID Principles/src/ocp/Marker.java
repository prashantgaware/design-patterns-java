package ocp;

public class Marker {
    private String color;
    private int inkLevel;
    private int price;

    public Marker(String color, int inkLevel, int price) {
        this.color = color;
        this.inkLevel = inkLevel;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
