package first_level.guitar;

import first_level.enums.Builder;
import first_level.enums.Type;
import first_level.enums.Wood;

public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
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
}
