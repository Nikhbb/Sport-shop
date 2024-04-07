package app;

public enum ProductColor {
    WHITE("білий"),
    BLACK("чорний"),
    RED("червоний"),
    BLUE("синій");

    public final String name;

    ProductColor(String name) {
        this.name = name;
    }
}
