package model;

import java.util.HashSet;
import java.util.Set;

public class ProductRegistry {
    private static ProductRegistry instance;
    private Set<Product> products;

    private ProductRegistry() {
        products = new HashSet<>();
    }

    public static ProductRegistry getInstance() {
        if (instance == null) {
            instance = new ProductRegistry();
        }
        return instance;
    }

    public boolean addProduct(Product product) {
        return products.add(product); // if product is added it gives true; if product is already existing it gives false
    }

    public Set<Product> getProducts() {
        return products;
    }
}
