package pizza.service;

import pizza.event.IEvent;
import pizza.event.PizzaOrderEvent;
import pizza.listener.IEventListener;

public class EmailService implements IEventListener {
    @Override
    public void onEvent(IEvent event) {
        PizzaOrderEvent  pizzaOrderEvent = (PizzaOrderEvent) event;
        System.out.println("EmailService onEvent: Email sent");
        System.out.println("Order placed with id : " + pizzaOrderEvent.getOrderId().toString());
    }
}
