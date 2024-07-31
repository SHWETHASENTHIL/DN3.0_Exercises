package SortingCustomerOrders;
public class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order("O001", "Olivia", 250.50),
                new Order("O002", "Billie", 150.75),
                new Order("O003", "Gwen", 300.20),
                new Order("O004", "Sara", 100.00),
                new Order("O005", "Jenny", 200.40)
        };

        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

