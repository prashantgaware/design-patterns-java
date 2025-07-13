package second_level.guitar;

import second_level.enums.Builder;
import second_level.enums.Type;
import second_level.enums.Wood;
import second_level.instrument.InstrumentSpec;

public class GuitarSpec extends InstrumentSpec {

    private final int numberOfStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numberOfStrings, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false;
        }
        if (!(otherSpec instanceof GuitarSpec guitarSpec)) {
            return false;
        }

        return guitarSpec.numberOfStrings == this.numberOfStrings;
    }
}
