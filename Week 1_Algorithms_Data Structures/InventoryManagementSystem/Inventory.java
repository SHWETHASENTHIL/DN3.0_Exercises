package InventoryManagementSystem;
import java.util.HashMap;
import java.util.Map;
class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void deleteProduct(String productId) {
        Product removedProduct = products.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("\nCurrent Inventory:");
        inventory.displayProducts();

        inventory.updateProduct("P002", "Smartphone", 25, 479.99);
        System.out.println("\nUpdated Inventory:");
        inventory.displayProducts();

        inventory.deleteProduct("P003");
        System.out.println("\nFinal Inventory:");
        inventory.displayProducts();
    }
}
