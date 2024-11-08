package adapter;

import model.Product;

public class ProductAdapter {
    private Product product;

    public ProductAdapter(Product product) {
        this.product = product;
    }

    public String getProductJson() {
        return "{ \"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + " }";
    }
}
