import adapter.ProductAdapter;
import controller.ProductController;
import factory.ProductFactory;
import iterator.ProductCollection;
import model.Product;
import model.ProductRegistry;
import proxy.ProductProxy;
import view.ProductView;

public class Main {
    public static void main(String[] args) {
        // Creating a couple of products and adding them into ProductRegistry
        ProductRegistry registry = ProductRegistry.getInstance();

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = ProductFactory.createProduct("electronics"); // Created via Factory
        Product product3 = new Product("Chair", 100.00);

        // Adding products using registry
        registry.addProduct(product1);
        registry.addProduct(product2); // it'll not add if it's dublicate
        registry.addProduct(product3);

        System.out.println("Products in the registry (unique):");
        for (Product product : registry.getProducts()) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }

        // Using ProductAdapter for converting into JSON
        ProductAdapter adapter = new ProductAdapter(product1);
        System.out.println("\nProduct JSON: " + adapter.getProductJson());

        // Proxy using example
        System.out.println("\nAttempting to access a product through a proxy:");
        ProductProxy proxyUser = new ProductProxy(product1, false); // Ordinary user
        proxyUser.displayProduct();

        ProductProxy proxyAdmin = new ProductProxy(product1, true); // Admin
        proxyAdmin.displayProduct();

        // Creating a controller for the product and a view for display
        ProductView view = new ProductView();
        ProductController controller = new ProductController(product1, view);

        // Showing product before updating
        System.out.println("\nOriginal product state:");
        controller.updateView();

        // Updating product using controller
        controller.setProductName("Gaming Laptop");
        controller.setProductPrice(1299.99);
        System.out.println("Updated product state:");
        controller.updateView();

        // Adding products to the collection and using an iterator to display them
        ProductCollection collection = new ProductCollection();
        collection.addProduct(product1);
        collection.addProduct(product2);
        collection.addProduct(product3);

        System.out.println("\nProduct collection:");
        for (Product item : collection) {
            view.displayProduct(item);
        }
    }
}
