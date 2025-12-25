package pizza.event;

import pizza.listener.IEventListener;

import java.util.ArrayList;
import java.util.List;

public class EventBus {
    private List<IEventListener>  listeners = new ArrayList<>();

    public void subscribe(IEventListener listener){
        listeners.add(listener);
    }

    public void publish(IEvent event){
        for (IEventListener listener : listeners){
            if (event != null){
                PizzaOrderEvent pizzaEvent = (PizzaOrderEvent) event;
                listener.onEvent(pizzaEvent);
            }
        }
    }
}
