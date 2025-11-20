package weather.push_approach;

public class WeatherStationClient {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherObserver observer1 = new CurrentConditionDisplay();
        WeatherObserver observer2 = new ForecastDisplay();

        station.addObserver(observer1);
        station.addObserver(observer2);

        station.setWeatherData(25.0f, 65.0f, 1013.0f);
        station.setWeatherData(28.0f, 70.0f, 1010.0f);

        station.removeObserver(observer1);

        station.setWeatherData(30.0f, 75.0f, 1008.0f);
    }
}
