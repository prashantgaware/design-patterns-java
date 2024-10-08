package dp.enum_solution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumDeserialisationTest {
    private static Object deSerialisation(Object obj) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("enum.ser"));
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        Printer printerEnum = Printer.INSTANCE;
        Printer p = (Printer) deSerialisation(printerEnum);
        System.out.println(printerEnum.hashCode() + " && " + p.hashCode());
        System.out.println("printerEnum == p : " + (printerEnum == p));

        /**
         * no need to use readResolve() method in Enum class
         * as Enum is inherently serializable
         * and it will always return the same instance
         * no matter how many times you serialize and deserialize it
         */
        // output:
        // 2018699554 && 2018699554
        // printerEnum == p : true
    }
}
