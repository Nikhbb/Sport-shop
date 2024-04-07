package app;

public enum ProductType {
    CAP("кепка"),
    TSHIRT("футболка");

    public final String name;

    ProductType(String name) {
        this.name = name;
    }
}
