package dp.serialisation_desrialisation;

import dp.object_cloning.CommonUtils;

import java.io.Serial;
import java.io.Serializable;

public class Printer implements Serializable {
    /**
     * To avoid creating a new instance of a singleton class
     * during deserialization, you can implement the
     * readResolve method. This method is called
     * when ObjectInputStream has read an object from the
     * stream and is used to replace the deserialized
     * object with the singleton instance.
     */

    private static final long serialVersionUID = 1L;

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

    // This method ensures that the singleton instance is returned during deserialization
    // Here we can return Exception object to stop deserialization of object as well.
    // Enum based singleton class is the best approach to stop deserialization of object.
    @Serial
    private Object readResolve() {
        return INSTANCE;
    }
}
