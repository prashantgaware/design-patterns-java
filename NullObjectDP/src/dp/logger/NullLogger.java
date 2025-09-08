package dp.logger;

public class NullLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("NullLogger.log");
        System.out.println("message = " + message);
    }
}
