package app;

public class Main {
    public static void main(String[] args) {
        Product tShirtRed = new Product.Builder()
                .productType(ProductType.TSHIRT)
                .productColor(ProductColor.RED)
                .factoryType(FactoryType.ACTIVE_SPORTS)
                .productPrice(15.35)
                .build();

        Product tShirtBlue = new Product.Builder()
                .productType(ProductType.TSHIRT)
                .productColor(ProductColor.BLUE)
                .factoryType(FactoryType.ACTIVE_SPORTS)
                .productPrice(16.59)
                .build();

        Product capWhite = new Product.Builder()
                .productType(ProductType.CAP)
                .productColor(ProductColor.WHITE)
                .factoryType(FactoryType.SMART_CAPS)
                .productPrice(5.35)
                .build();

        Product capBlack = new Product.Builder()
                .productType(ProductType.CAP)
                .productColor(ProductColor.BLACK)
                .factoryType(FactoryType.SMART_CAPS)
                .productPrice(6.56)
                .build();

        Order orderA = new Order();
        orderA.addProduct(tShirtRed);
        orderA.addProduct(capWhite);

        Order orderB = new Order();
        orderB.addProduct(tShirtBlue);
        orderB.addProduct(capBlack);

        orderA.printOrder();
        orderB.printOrder();
    }
}
