package dp.logger;

public class RealLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("RealLogger.log");
        System.out.println("Log message: " + message);
    }
}
