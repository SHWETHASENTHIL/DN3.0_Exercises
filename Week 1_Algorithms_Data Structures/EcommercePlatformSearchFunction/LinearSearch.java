package EcommercePlatformSearchFunction;
class LinearSearch {
    public static Product linearSearch(Product[] products, String targetProductId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId)) {
                return product;
            }
        }
        return null; // Product not found
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Tablet", "Electronics"),
                new Product("P004", "Monitor", "Electronics"),
                new Product("P005", "Keyboard", "Electronics")
        };

        String targetProductId = "P003";
        Product foundProduct = linearSearch(products, targetProductId);

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product with ID " + targetProductId + " not found.");
        }
    }
}


