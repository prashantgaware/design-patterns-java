package weather.push_approach;

public class ForecastDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("ForecastDisplay.update");
        System.out.println("Temperature: " + weatherData.getTemperature() + "°C");
        System.out.println("Humidity: " + weatherData.getHumidity() + "%");
        System.out.println("Pressure: " + weatherData.getPressure() + " hPa");
        System.out.println();
    }
}
