package second_level.test;

import second_level.enums.Builder;
import second_level.enums.Style;
import second_level.enums.Type;
import second_level.enums.Wood;
import second_level.guitar.GuitarSpec;
import second_level.instrument.Instrument;
import second_level.instrument.InstrumentSpec;
import second_level.inventory.Inventory;
import second_level.mandolin.MandolinSpec;

import java.util.List;

public class InstrumentFinderTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        InstrumentSpec whatCustomerWants = new MandolinSpec(Builder.GIBSON, "F-5G",
                Type.ACOUSTIC, Wood.MAPLE, Wood.MAPLE, Style.F);

        List<Instrument> matchingInstruments = inventory.search(whatCustomerWants);

        if (!matchingInstruments.isEmpty()) {
            System.out.println("Congratulations! We found a match for you:");
            for (Instrument instrument : matchingInstruments) {
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("-------------------------------------");
                System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " instrument:");
                System.out.println("  Top Wood: " + spec.getTopWood());
                System.out.println("  Back Wood: " + spec.getBackWood());

                // Print properties specific to the instrument type
                if (spec instanceof GuitarSpec guitarSpec) {
                    System.out.println("  Number of Strings: " + guitarSpec.getNumberOfStrings());
                } else if (spec instanceof MandolinSpec mandolinSpec) {
                    System.out.println("  Style: " + mandolinSpec.getStyle());
                }

                System.out.println("You can have it for only $" + instrument.getPrice() + "!");
                System.out.println("Serial Number: " + instrument.getSerialNumber());
                System.out.println("-------------------------------------");
            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }
}