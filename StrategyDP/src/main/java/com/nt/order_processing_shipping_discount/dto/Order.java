package com.nt.order_processing_shipping_discount.dto;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private Customer customer;
    private double subTotal;
    private double totalWeightInKg;
    private double discountedAmount;
    private double shippingCost;
    private double finalTotal;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
        recalculateTotals();
    }

    private void recalculateTotals() {
        this.subTotal = 0;
        this.totalWeightInKg = 0;
        for (OrderItem item : items) {
            this.subTotal += item.getTotalPrice();
            this.totalWeightInKg += item.getTotalWeight();
        }
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getTotalWeightInKg() {
        return totalWeightInKg;
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setDiscountedAmount(double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", customer=" + customer +
                ", subTotal=" + subTotal +
                ", totalWeightInKg=" + totalWeightInKg +
                ", discountedAmount=" + discountedAmount +
                ", shippingCost=" + shippingCost +
                ", finalTotal=" + finalTotal +
                '}';
    }
}
