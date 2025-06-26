package com.nt.order_processing_shipping_discount.dto;

public class Customer {
    private String name;
    private LoyaltyTier loyaltyTier;

    public Customer(String name, LoyaltyTier loyaltyTier) {
        this.name = name;
        this.loyaltyTier = loyaltyTier;
    }

    public String getName() {
        return name;
    }

    public LoyaltyTier getLoyaltyTier() {
        return loyaltyTier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", loyaltyTier=" + loyaltyTier +
                '}';
    }
}
