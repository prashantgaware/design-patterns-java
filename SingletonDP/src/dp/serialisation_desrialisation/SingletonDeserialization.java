package dp.serialisation_desrialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SingletonDeserialization
{
    private static Printer doDeserialization() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.ser"));

            return (Printer) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Printer p1 = doDeserialization();
        Printer p2 = doDeserialization();

        // Here, p1 and p2 are two different objects.
        // the reason being is, when we deserialize an object, a new object is created.
        System.out.println(p1.hashCode() + " && " + p2.hashCode());
        System.out.println("p1 == p2 : " + (p1 == p2));
    }

}
