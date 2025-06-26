package com.nt.order_processing_shipping_discount.discount_impl;

import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(Order order) {
        double discountAmount = order.getSubTotal() * percentage;
        System.out.println("Applying " + percentage + "% discount for order: " + order);
        return discountAmount;
    }
}
