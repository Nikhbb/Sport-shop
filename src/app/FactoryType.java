package app;

public enum FactoryType {
    ACTIVE_SPORTS("Active sports"),
    SMART_CAPS("Smart caps");

    public final String name;

    FactoryType(String name) {
        this.name = name;
    }
}
