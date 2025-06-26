package com.nt.order_processing_shipping_discount.order_processor;

import com.nt.order_processing_shipping_discount.discount_impl.NoDiscount;
import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.shipping_impl.FlatRateShipping;
import com.nt.order_processing_shipping_discount.shipping_impl.WeightBasedShipping;
import com.nt.order_processing_shipping_discount.strategy.DiscountStrategy;
import com.nt.order_processing_shipping_discount.strategy.ShippingStrategy;

public class OrderProcessor {
    private ShippingStrategy shippingStrategy;
    private DiscountStrategy discountStrategy;

    public OrderProcessor() {
        this.discountStrategy = new NoDiscount();
        this.shippingStrategy = new FlatRateShipping(0.5);
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void processOrder(Order order) {
        System.out.println("Processing order: " + order + "\n" + " for customer: " + order.getCustomer().getName());
        System.out.println("Initial order total: " + order.getSubTotal());
        double discountAmount = discountStrategy.applyDiscount(order);
        order.setDiscountedAmount(discountAmount);
        double priceAfterDiscount = order.getSubTotal() - discountAmount;
        System.out.println("Price after discount: " + priceAfterDiscount);

        double shippingCost = shippingStrategy.calculateShippingCost(order);
        order.setShippingCost(shippingCost);
        System.out.println("Shipping cost: " + shippingCost);

        double finalPrice = priceAfterDiscount + shippingCost;
        order.setFinalTotal(finalPrice);
        System.out.println("Final price after shipping: " + finalPrice);

        System.out.println("Order processed successfully!\n");
        System.out.println("--------- Order Summary ---------");
        System.out.println(order);
        System.out.println("--------- End of Order Summary ---------\n");
    }
}
