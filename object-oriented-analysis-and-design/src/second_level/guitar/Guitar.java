package second_level.guitar;

import second_level.instrument.Instrument;
import second_level.instrument.InstrumentSpec;

public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price, InstrumentSpec spec) {
        super(serialNumber, price, spec);
    }

}
