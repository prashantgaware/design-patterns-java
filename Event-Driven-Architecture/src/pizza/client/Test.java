package pizza.client;

import pizza.event.EventBus;
import pizza.service.EmailService;
import pizza.service.KitchenService;
import pizza.service.OrderService;

public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.subscribe(new KitchenService());
        eventBus.subscribe(new EmailService());

        OrderService orderService = new OrderService(eventBus);
        orderService.placeOrder("John Doe", "Margaritta", 200.0);
    }
}
