package dp.serialisation_desrialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SingletonSerialisationTest {

    private static void doSerialisation(Printer printer) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            objectOutputStream.writeObject(printer);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        doSerialisation(p1);
    }
}
