package pizza.event;

import java.util.UUID;

public class PizzaOrderEvent implements IEvent {
    private UUID orderId;
    private String customerName;
    private String pizzaType;
    private double amount;

    public  PizzaOrderEvent(UUID orderId, String customerName, String pizzaType, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.pizzaType = pizzaType;
        this.amount = amount;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public double getAmount() {
        return amount;
    }
}
