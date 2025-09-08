package dp.logger;

public class LoggerFactory {
    public static Logger getLogger(String loggerType) {
        if (loggerType == null) {
            return new NullLogger();
        }
        if (loggerType.equalsIgnoreCase("REAL")) {
            return new RealLogger();
        }
        return new NullLogger();
    }
}
