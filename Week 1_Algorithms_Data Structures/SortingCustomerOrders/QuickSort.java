package SortingCustomerOrders;
public class QuickSort {
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // Swap orders[i+1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order("O001", "Olivia", 250.50),
                new Order("O002", "Billie", 150.75),
                new Order("O003", "Gwen", 300.20),
                new Order("O004", "Sara", 100.00),
                new Order("O005", "Jenny", 200.40)
        };

        System.out.println("Before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

