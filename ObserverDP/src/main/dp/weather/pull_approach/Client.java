package weather.pull_approach;

public class Client {
    public static void main(String[] args) {
        Station station = new Station();
        Observer1 observer1 = new Observer1(station);
        Observer2 observer2 = new Observer2(station);
        station.setMeasurements(30.5f, 65, 1013.1f);
        station.setMeasurements(28.0f, 70, 1012.5f);

        System.out.println("--- Removing Observer1 ---");
        station.removeObserver(observer1);
        station.setMeasurements(25.0f, 80, 1011.0f);

    }
}
