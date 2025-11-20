package weather.push_approach;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
    void setWeatherData(float temperature, float humidity, float pressure);
}
