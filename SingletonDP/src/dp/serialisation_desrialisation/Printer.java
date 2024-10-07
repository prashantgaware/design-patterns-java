package dp.serialisation_desrialisation;

import dp.object_cloning.CommonUtils;

import java.io.Serializable;

public class Printer implements Serializable {
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

}
