package second_level.instrument;

import second_level.enums.Builder;
import second_level.enums.Type;
import second_level.enums.Wood;

public abstract class InstrumentSpec {
    private final Builder builder;
    private final String model;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (builder != null && !builder.equals(otherSpec.getBuilder())) {
            return false;
        }
        if (model != null && !model.equals(otherSpec.getModel())) {
            return false;
        }
        if (type != null && !type.equals(otherSpec.getType())) {
            return false;
        }
        if (backWood != null && !backWood.equals(otherSpec.getBackWood())) {
            return false;
        }
        return topWood == null || topWood.equals(otherSpec.getTopWood());
    }
}
