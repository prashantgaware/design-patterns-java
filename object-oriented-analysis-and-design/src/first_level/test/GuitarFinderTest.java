package first_level.test;

import first_level.enums.Builder;
import first_level.enums.Type;
import first_level.enums.Wood;
import first_level.guitar.Guitar;
import first_level.guitar.GuitarSpec;
import first_level.inventory.GuitarInventory;

import java.util.List;

public class GuitarFinderTest {
    public static void main(String[] args) {
        GuitarSpec whatEricLikes = new GuitarSpec(Builder.FENDER, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.MAHOGANY);
        List<Guitar> matchingGuitars = getGuitars(whatEricLikes);
        if (matchingGuitars.isEmpty()) {
            System.out.println("Sorry, Eric, we have nothing for you.");
        } else {
            System.out.println("Eric, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                System.out.println("We have a " + guitar.getSpec().getBuilder() + " " +
                        guitar.getSpec().getType() + " guitar:\n   " +
                        guitar.getSpec().getBackWood() + " back and sides,\n   " +
                        guitar.getSpec().getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        }
    }

    private static List<Guitar> getGuitars(GuitarSpec guitarSpec) {
        GuitarInventory inventory = new GuitarInventory(
                List.of(
                        new Guitar("12345", 1500.0, new GuitarSpec(Builder.FENDER, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.MAHOGANY)),
                        new Guitar("67890", 2000.0, new GuitarSpec(Builder.GIBSON, Type.ELECTRIC, Wood.MAPLE, Wood.BRAZILIAN_ROSEWOOD)),
                        new Guitar("54321", 1800.0, new GuitarSpec(Builder.FENDER, Type.ACOUSTIC, Wood.CEDAR, Wood.SITKA)),
                        new Guitar("09876", 2200.0, new GuitarSpec(Builder.GIBSON, Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK)),
                        new Guitar("11223", 1600.0, new GuitarSpec(Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.CEDAR)),
                        new Guitar("44556", 1700.0, new GuitarSpec(Builder.GIBSON, Type.ACOUSTIC, Wood.COCOBOLO, Wood.SITKA)),
                        new Guitar("77889", 1900.0, new GuitarSpec(Builder.FENDER, Type.ACOUSTIC, Wood.MAPLE, Wood.ADIRONDACK))
                )
        );

        return inventory.searchGuitars(guitarSpec);
    }
}
