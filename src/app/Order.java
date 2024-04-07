package app;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    private Double getOrderSum() {
        double total = 0;
        for (Product item : products) {
            total += item.getProductPrice();
        }
        return total;
    }

    public void printOrder() {
        for (Product item : products) {
            System.out.println("Назва товару: " + item.getProductType().name);
            System.out.println("\tФірма-виробник: " + item.getFactoryType().name);
            System.out.println("\tЦіна товару:  $" + item.getProductPrice());
        }
        System.out.println("*********************");
        System.out.println("Загальна вартість:  $" + getOrderSum());
        System.out.println();
    }

}
