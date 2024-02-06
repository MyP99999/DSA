import java.util.*;

public class Solution {

    public static int[] orderPizza(int[] orderPlaced, int size) {
        // Use a LinkedList for easy removal of the first element and to add to the end
        LinkedList<Integer> screenOrders = new LinkedList<>();

        // Process each order
        for (int order : orderPlaced) {
            // If the screen is full, remove the first order
            if (screenOrders.size() == size) {
                screenOrders.poll();
            }
            // Add the new order to the end of the screen
            screenOrders.offer(order);
        }

        // Convert the LinkedList to an int array for the result
        int[] result = new int[screenOrders.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = screenOrders.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the total number of orders
        int orderPlacedSize = scanner.nextInt();
        int[] orderPlaced = new int[orderPlacedSize];

        // Read each order into the array
        for (int i = 0; i < orderPlacedSize; i++) {
            orderPlaced[i] = scanner.nextInt();
        }

        // Read the size of the screen
        int size = scanner.nextInt();

        // Get the final orders on the screen
        int[] result = orderPizza(orderPlaced, size);

        // Print the orders that are currently on the screen
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        scanner.close();
    }
}
