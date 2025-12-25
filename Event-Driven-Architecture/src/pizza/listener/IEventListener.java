package pizza.listener;

import pizza.event.IEvent;

public interface IEventListener {
    void onEvent(IEvent event);
}
