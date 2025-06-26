package com.nt.order_processing_shipping_discount.shipping_impl;

import com.nt.order_processing_shipping_discount.dto.LoyaltyTier;
import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.ShippingStrategy;

public class PremiumShipping implements ShippingStrategy {
    private double baseRate;
    private double highValueThreshold;
    private double highValueShippingCost;

    public PremiumShipping(double baseRate, double highValueThreshold, double highValueShippingCost) {
        this.baseRate = baseRate;
        this.highValueThreshold = highValueThreshold;
        this.highValueShippingCost = highValueShippingCost;
    }

    @Override
    public double calculateShippingCost(Order order) {
        double cost;
        if (order.getCustomer().getLoyaltyTier() == LoyaltyTier.PLATINUM && order.getSubTotal() > 500) {
            System.out.println("Platinum customer with high value order, applying free shipping." + order);
            cost = 0.0;
        } else if (order.getSubTotal() - order.getDiscountedAmount() > highValueThreshold) {
            System.out.println("High value order, applying flat shipping cost of " + highValueShippingCost + " for order: " + order);
            cost = highValueShippingCost;
        } else {
            System.out.println("Calculating premium shipping cost for order: " + order);
            cost = baseRate + (order.getSubTotal() * 0.05); // 5% of subtotal as additional charge
        }

        return cost;
    }
}
