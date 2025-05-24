package first_level.inventory;

import first_level.guitar.Guitar;
import first_level.guitar.GuitarSpec;

import java.util.List;

public class GuitarInventory {
    private final List<Guitar> guitars;

    public GuitarInventory(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> searchGuitars(GuitarSpec guitarSpec) {
        return guitars.stream()
                .filter(guitar -> (guitarSpec.getBuilder() == null || guitar.getSpec().getBuilder() == guitarSpec.getBuilder()) &&
                        (guitarSpec.getType() == null || guitar.getSpec().getType() == guitarSpec.getType()) &&
                        (guitarSpec.getBackWood() == null || guitar.getSpec().getBackWood() == guitarSpec.getBackWood()) &&
                        (guitarSpec.getTopWood() == null || guitar.getSpec().getTopWood() == guitarSpec.getTopWood()))
                .toList();
    }
}
