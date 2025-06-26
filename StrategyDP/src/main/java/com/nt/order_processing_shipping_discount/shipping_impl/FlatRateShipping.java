package com.nt.order_processing_shipping_discount.shipping_impl;

import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.ShippingStrategy;

public class FlatRateShipping implements ShippingStrategy {
    private double rate;

    public FlatRateShipping(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateShippingCost(Order order) {
        System.out.println("Calculating flat rate shipping cost of " + rate + " for order: " + order);
        return rate;
    }
}
