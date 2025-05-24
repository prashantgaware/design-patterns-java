package first_level.enums;

public enum Type {
    ACOUSTIC,
    ELECTRIC,
    BASS;

    @Override
    public String toString() {
        return switch (this) {
            case ACOUSTIC -> "Acoustic";
            case ELECTRIC -> "Electric";
            case BASS -> "Bass";
            default -> "Unknown Type";
        };
    }
}
