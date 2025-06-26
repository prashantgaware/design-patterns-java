package com.nt.order_processing_shipping_discount.discount_impl;

import com.nt.order_processing_shipping_discount.dto.Customer;
import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.strategy.DiscountStrategy;

public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(Order order) {
        Customer customer = order.getCustomer();
        double discountAmount = 0.0;
        switch (customer.getLoyaltyTier()) {
            case GOLD:
                discountAmount = order.getSubTotal() * 0.10;
                System.out.println("Applying 10% loyalty discount for GOLD customer: " + customer.getName());
                break;

            case SILVER:
                discountAmount = order.getSubTotal() * 0.05;
                System.out.println("Applying 5% loyalty discount for SILVER customer: " + customer.getName());
                break;

            case PLATINUM:
                discountAmount = order.getSubTotal() * 0.15;
                System.out.println("Applying 15% loyalty discount for PLATINUM customer: " + customer.getName());
                break;

            default:
                System.out.println("No loyalty discount applicable for customer: " + customer.getName());
                break;
        }
        return discountAmount;
    }
}
