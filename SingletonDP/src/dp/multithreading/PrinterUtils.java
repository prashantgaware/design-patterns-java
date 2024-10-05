package dp.multithreading;

public class PrinterUtils {
        private static volatile PrinterUtils INSTANCE = null;

        private PrinterUtils() {
            System.out.println("PrinterUtils instance created");
        }

    /**
     * This method is used to get the instance of PrinterUtils class
     * making it synchronized to avoid multiple threads to create multiple instances
     * Since synchronized method allows only one thread inside the method at a time
     * there is no problem of multiple threads creating multiple instances and
     * breaking the singleton pattern/behavior
     * @return
     */
    public synchronized final static PrinterUtils getInstance1() {
            if (INSTANCE == null) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new PrinterUtils();
            }

            return INSTANCE;
    }

    // TODO : Best-1 approach
    /**
     * This method is used to get the instance of PrinterUtils class
     * making it synchronized to avoid multiple threads to create multiple instances
     * Adding double null check to avoid multiple threads to create multiple instances
     * Instead making a method synchronized, we are making the block synchronized
     * so that only one thread can enter the block at a time
     * making INSTANCE as volatile to avoid reordering of instructions by JVM
     * it is good practice to make static fields as volatile in multithreaded environment
     * this is best-1 approach to create singleton class
     * @return
     */
    public static PrinterUtils getInstance2() {
        if (INSTANCE == null) {
            // we cannot use synchronized(this) as this is static method
            // so we use synchronized block with class level lock
            synchronized (PrinterUtils.class) {     // class level lock(all static properties of class will be locked)
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new PrinterUtils();
                }
            }
        }

        return INSTANCE;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
