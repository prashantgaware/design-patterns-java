package com.nt.order_processing_shipping_discount.discount_impl;

import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.DiscountStrategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(Order order) {
        System.out.println("No discount applied for order: " + order);
        return 0.0;
    }
}
