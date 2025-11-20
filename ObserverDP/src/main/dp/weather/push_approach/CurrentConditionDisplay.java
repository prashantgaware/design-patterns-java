package weather.push_approach;

public class CurrentConditionDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("CurrentConditionDisplay.update");
        System.out.println("Temperature: " + weatherData.getTemperature() + "°C");
        System.out.println("Humidity: " + weatherData.getHumidity() + "%");
        System.out.println("Pressure: " + weatherData.getPressure() + " hPa");
        System.out.println();
    }
}
