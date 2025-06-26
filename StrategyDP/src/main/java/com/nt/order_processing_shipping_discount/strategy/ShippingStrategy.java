package com.nt.order_processing_shipping_discount.strategy;

import com.nt.order_processing_shipping_discount.dto.Order;

public interface ShippingStrategy {
    double calculateShippingCost(Order order);
}
