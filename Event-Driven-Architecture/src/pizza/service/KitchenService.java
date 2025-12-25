package pizza.service;

import pizza.event.IEvent;
import pizza.event.PizzaOrderEvent;
import pizza.listener.IEventListener;

public class KitchenService implements IEventListener {
    @Override
    public void onEvent(IEvent event) {
        PizzaOrderEvent  pizzaOrderEvent = (PizzaOrderEvent) event;
        System.out.println("KitchenService onEvent: Started preparing");
        System.out.println("Order placed with id : " + pizzaOrderEvent.getOrderId().toString());
    }
}
