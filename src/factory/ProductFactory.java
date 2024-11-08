package factory;

import model.Product;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Product("Laptop", 1200.00);
            case "furniture":
                return new Product("Chair", 150.00);
            case "toys":
                return new Product("Lego", 350.00);
            default:
                return new Product("Unknown Product", 0.00);
        }
    }
}
