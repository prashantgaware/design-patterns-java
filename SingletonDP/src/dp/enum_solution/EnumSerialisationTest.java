package dp.enum_solution;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EnumSerialisationTest {
    /**
     * Serialisation
     * @param obj
     */
    private static void deSerialisation(Object obj) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("enum.ser"));
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Printer printerEnum = Printer.INSTANCE;
        deSerialisation(printerEnum);
    }
}
