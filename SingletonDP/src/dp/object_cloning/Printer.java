package dp.object_cloning;

public class Printer extends CommonUtils{
    private static Printer INSTANCE = new Printer();
    private Printer() {
        System.out.println("Printer instance created");
    }
    public static Printer getInstance() {
        return INSTANCE;
    }
    public void print(String message) {
        System.out.println(message);
    }

    /**
     * To stop cloning of an object, we can override the clone() method in the class and throw CloneNotSupportedException.
     * 1. Override clone() in singleton class and return already created instance.
     */
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return INSTANCE;
//    }

    /**
     * TODO : This is the best approach to stop cloning of an object.
     * 2. Override clone() in singleton class and throw CloneNotSupportedException.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /**
     * TODO : This is the second best approach to stop cloning of an object.
     * 3. Develop Enum based singleton class.
     */
}
