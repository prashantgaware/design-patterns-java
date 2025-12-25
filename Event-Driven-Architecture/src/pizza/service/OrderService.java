package pizza.service;

import pizza.event.EventBus;
import pizza.event.IEvent;
import pizza.event.PizzaOrderEvent;

import java.util.UUID;

public class OrderService {
    private final EventBus  eventBus;

    public OrderService(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void placeOrder(String customerName, String pizzaType, double price){
        UUID orderId = UUID.randomUUID();
        System.out.println("Order Placed: " + orderId);
        IEvent pizzaOrderEvent = new PizzaOrderEvent(orderId, customerName, pizzaType, price);
        eventBus.publish(pizzaOrderEvent);
    }
}
