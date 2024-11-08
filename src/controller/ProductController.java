// src/controller/ProductController.java
package controller;

import model.Product;
import view.ProductView;

public class ProductController {
    private Product product;
    private ProductView view;

    public ProductController(Product product, ProductView view) {
        this.product = product;
        this.view = view;
    }

    public void updateView() {
        view.displayProduct(product);
    }

    public void setProductName(String name) {
        product = new Product(name, product.getPrice());
    }

    public void setProductPrice(double price) {
        product = new Product(product.getName(), price);
    }
}
