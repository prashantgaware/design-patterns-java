package com.nt.order_processing_shipping_discount.discount_impl;

import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.DiscountStrategy;

public class FixedAmountDiscount implements DiscountStrategy {
    private double fixedAmount;

    public FixedAmountDiscount(double percentage) {
        this.fixedAmount = percentage;
    }

    @Override
    public double applyDiscount(Order order) {
        double discountAmount = Math.min(order.getSubTotal(), fixedAmount);
        System.out.println("Applying fixed amount discount of " + fixedAmount + " for order: " + order);
        return discountAmount;
    }
}
