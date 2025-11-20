package weather.pull_approach;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setMeasurements(float temperature, float humidity, float pressure);
}
