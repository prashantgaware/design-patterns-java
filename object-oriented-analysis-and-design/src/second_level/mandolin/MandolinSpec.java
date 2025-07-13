package second_level.mandolin;

import second_level.enums.Builder;
import second_level.enums.Style;
import second_level.enums.Type;
import second_level.enums.Wood;
import second_level.instrument.InstrumentSpec;

public class MandolinSpec extends InstrumentSpec {

    private final Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false;
        }
        if (!(otherSpec instanceof MandolinSpec mandolinSpec)) {
            return false;
        }

        return style.equals(mandolinSpec.style);
    }
}
