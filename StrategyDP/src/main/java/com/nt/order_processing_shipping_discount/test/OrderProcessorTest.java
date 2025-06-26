package com.nt.order_processing_shipping_discount.test;

import com.nt.order_processing_shipping_discount.discount_impl.FixedAmountDiscount;
import com.nt.order_processing_shipping_discount.discount_impl.LoyaltyDiscount;
import com.nt.order_processing_shipping_discount.discount_impl.NoDiscount;
import com.nt.order_processing_shipping_discount.discount_impl.PercentageDiscount;
import com.nt.order_processing_shipping_discount.dto.Customer;
import com.nt.order_processing_shipping_discount.dto.LoyaltyTier;
import com.nt.order_processing_shipping_discount.dto.Order;
import com.nt.order_processing_shipping_discount.dto.OrderItem;
import com.nt.order_processing_shipping_discount.order_processor.OrderProcessor;
import com.nt.order_processing_shipping_discount.shipping_impl.PremiumShipping;
import com.nt.order_processing_shipping_discount.shipping_impl.WeightBasedShipping;

public class OrderProcessorTest {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer("John Doe", LoyaltyTier.NONE);
        Customer silverCustomer = new Customer("Jane Smith", LoyaltyTier.SILVER);
        Customer goldCustomer = new Customer("Peter Jones", LoyaltyTier.GOLD);
        Customer platinumCustomer = new Customer("Alice Wonderland", LoyaltyTier.PLATINUM);

        // Create Order Items
        OrderItem laptop = new OrderItem("Laptop Pro", 1200.00, 1, 2.5);
        OrderItem mouse = new OrderItem("Gaming Mouse", 75.00, 1, 0.2);
        OrderItem book = new OrderItem("Design Patterns", 40.00, 2, 0.8);

        // Create Order Processor
        OrderProcessor processor = new OrderProcessor();

        // --- Scenario 1: Regular customer, standard shipping, no special discount ---
        Order order1 = new Order(regularCustomer);
        order1.addItem(laptop);
        order1.addItem(mouse);

        processor.setDiscountStrategy(new NoDiscount()); // Explicitly set, or rely on default
        processor.setShippingStrategy(new WeightBasedShipping(5.0, 2.0)); // $5 base, $2/kg
        processor.processOrder(order1);

        // --- Scenario 2: Gold customer, weekend percentage discount, premium shipping ---
        Order order2 = new Order(goldCustomer);
        order2.addItem(book);
        order2.addItem(mouse);

        // Gold customer also gets an additional 10% weekend sale discount!
        // We can either create a CombinedDiscountStrategy or apply Loyalty first then another.
        // For simplicity, let's use a specific PercentageDiscount for a "Sale"
        processor.setDiscountStrategy(new PercentageDiscount(0.10)); // 10% Sale
        // Note: A more complex system might have a DiscountAggregatorStrategy
        // or apply LoyaltyTierDiscountStrategy and then apply sale discount on the result.
        // For now, PercentageDiscount overrides Loyalty for this "Sale" scenario.
        // A better approach would be a CompositeDiscountStrategy.

        processor.setShippingStrategy(new PremiumShipping(20.0, 100.0, 0.0)); // $20 base, free if order > $100 after discount
        processor.processOrder(order2);

        // --- Scenario 3: Platinum customer, loyalty discount, premium shipping ---
        Order order3 = new Order(platinumCustomer);
        order3.addItem(new OrderItem("Luxury Watch", 500.00, 1, 0.5));

        processor.setDiscountStrategy(new LoyaltyDiscount());
        // Platinum might get free premium shipping based on PremiumShippingStrategy logic
        processor.setShippingStrategy(new PremiumShipping(25.0, 200.0, 10.0));
        processor.processOrder(order3);

        // --- Scenario 4: Change strategy for the same order (demonstrating runtime change) ---
        System.out.println("\n--- REPROCESSING order1 with different strategies ---");
        // John Doe (order1) calls back, wants faster shipping and applies a coupon
        processor.setDiscountStrategy(new FixedAmountDiscount(50.00)); // $50 coupon
        processor.setShippingStrategy(new PremiumShipping(20.0, 100.0, 5.0));
        processor.processOrder(order1);
    }
}
