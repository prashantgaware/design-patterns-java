package com.nt.order_processing_shipping_discount.shipping_impl;

import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.ShippingStrategy;

public class WeightBasedShipping implements ShippingStrategy {
    private double ratePerKg;
    private double baseRate;

    public WeightBasedShipping(double ratePerKg, double baseRate) {
        this.ratePerKg = ratePerKg;
        this.baseRate = baseRate;
    }

    @Override
    public double calculateShippingCost(Order order) {
        double weight = order.getTotalWeightInKg();
        double shippingCost = baseRate + (ratePerKg * weight);
        System.out.println("Calculating weight-based shipping cost for order: " + order + ", Cost: " + shippingCost);
        return shippingCost;
    }
}
