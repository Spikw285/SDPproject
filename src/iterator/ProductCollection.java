package iterator;

import model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection implements Iterable<Product> {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
