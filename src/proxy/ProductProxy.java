package proxy;

import model.Product;

public class ProductProxy {
    private Product product;
    private boolean isAdmin;

    public ProductProxy(Product product, boolean isAdmin) {
        this.product = product;
        this.isAdmin = isAdmin;
    }

    public void displayProduct() {
        if (isAdmin) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        } else {
            System.out.println("Access denied: You are not an admin.");
        }
    }
}
