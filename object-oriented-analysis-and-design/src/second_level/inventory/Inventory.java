package second_level.inventory;

import second_level.enums.Builder;
import second_level.enums.Style;
import second_level.enums.Type;
import second_level.enums.Wood;
import second_level.guitar.Guitar;
import second_level.guitar.GuitarSpec;
import second_level.instrument.Instrument;
import second_level.instrument.InstrumentSpec;
import second_level.mandolin.Mandolin;
import second_level.mandolin.MandolinSpec;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Instrument> inventory;

    public Inventory() {
        this.inventory = new LinkedList<>();
        initializeInventory();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, spec);
        }
        if (instrument != null) {
            inventory.add(instrument);
        }
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }

        return null;
    }

    public List<Instrument> search(InstrumentSpec spec) {
        List<Instrument> matchingInstruments = new LinkedList<>();
        for (Instrument instrument : inventory) {
            if (instrument.getSpec().matches(spec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }

    private void initializeInventory() {
        addInstrument("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
        addInstrument("11277", 3999.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK));
        addInstrument("GIB123", 2999.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE));
        addInstrument("COL456", 6500.00,
                new GuitarSpec(Builder.COLLINGS, "OM2H", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA));

        addInstrument("MAN789", 9500.00,
                new MandolinSpec(Builder.GIBSON, "F-5G", Type.ACOUSTIC, Wood.MAPLE, Wood.MAPLE, Style.F));
        addInstrument("MAN012", 4500.00,
                new MandolinSpec(Builder.COLLINGS, "MF", Type.ACOUSTIC, Wood.MAPLE, Wood.ADIRONDACK, Style.F));
    }
}
