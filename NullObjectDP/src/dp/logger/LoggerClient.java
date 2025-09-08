package dp.logger;

public class LoggerClient {

    public static void main(String[] args) {
        // Using NullLogger
        Logger nullLogger = LoggerFactory.getLogger("NULL");
        nullLogger.log("This log message will be ignored.");
        // Using RealLogger
        Logger logger = LoggerFactory.getLogger("REAL");
        logger.log("This is a real log message.");
    }

}
