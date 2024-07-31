package EcommercePlatformSearchFunction;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String targetProductId) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId)); // Ensure the array is sorted

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(targetProductId)) {
                return midProduct;
            }

            if (midProduct.getProductId().compareTo(targetProductId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
        Product foundProduct = binarySearch(products, targetProductId);

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product with ID " + targetProductId + " not found.");
        }
    }
}

