package weather.pull_approach;

import java.util.ArrayList;
import java.util.List;

public class Station implements Observable {

    private List<Observer> observers;

    public float getTemperature() {
        return temperature;
    }

    private float temperature;

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private float humidity;
    private float pressure;

    public Station() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
