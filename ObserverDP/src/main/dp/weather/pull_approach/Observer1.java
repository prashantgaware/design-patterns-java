package weather.pull_approach;

public class Observer1 implements Observer {

    private final Observable observable;

    public Observer1(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update() {
        if (this.observable != null) {
            Station weatherData = (Station) this.observable;
            System.out.println("Observer1.update");
            System.out.println("Temperature: " + weatherData.getTemperature());
            System.out.println("Humidity: " + weatherData.getHumidity());
            System.out.println("Pressure: " + weatherData.getPressure());
        }
    }
}
