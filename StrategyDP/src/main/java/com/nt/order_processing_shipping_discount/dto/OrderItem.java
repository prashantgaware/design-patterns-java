package com.nt.order_processing_shipping_discount.dto;

public class OrderItem {
    private String itemName;
    private double price;
    private int quantity;
    private double weightKg;

    public OrderItem(String itemName, double price, int quantity, double weightKg) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.weightKg = weightKg;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public double getTotalWeight() {
        return weightKg * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", weightKg=" + weightKg +
                '}';
    }
}
