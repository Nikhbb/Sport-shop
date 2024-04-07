package app;

public class Product {
    private ProductType productType;
    private ProductColor productColor;
    private FactoryType factoryType;
    private double productPrice;

    public ProductType getProductType() {
        return productType;
    }

    public ProductColor getProductColor() {
        return productColor;
    }

    public FactoryType getFactoryType() {
        return factoryType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType=" + productType +
                ", productColor=" + productColor +
                ", factoryType=" + factoryType +
                ", productPrice=" + productPrice +
                '}';
    }

    public static class Builder {
        private Product product;

        public Builder() {
            product = new Product();
        }

        public Builder productType(ProductType productType) {
            product.productType = productType;
            return this;
        }

        public Builder productColor(ProductColor productColor) {
            product.productColor = productColor;
            return this;
        }

        public Builder factoryType(FactoryType factoryType) {
            product.factoryType = factoryType;
            return this;
        }

        public Builder productPrice(Double productPrice) {
            product.productPrice = productPrice;
            return this;
        }

        public Product build() {
            return product;
        }
    }
}
