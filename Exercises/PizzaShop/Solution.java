import java.util.*;

public class Solution {

    public static int[] orderPizza(int[] orderNumbers, int size) {
        LinkedList<Integer> displayScreen = new LinkedList<>();
        ArrayList<Integer> tempAnswer = new ArrayList<>();
        for (int i = 0; i < orderNumbers.length; i++) {
            int currentOrder = orderNumbers[i];

            // Add the current order to the display screen
            displayScreen.addLast(currentOrder);

            // When the screen is full, process to find the first meat pizza order
            if (displayScreen.size() >= size) {
                int firstMeatPizzaOrder = 0; // Assume no meat pizza order by default
                for (int order : displayScreen) {
                    if (order < 0) {
                        firstMeatPizzaOrder = order;
                        break; // Exit loop once the first meat pizza order is found
                    }
                }
                tempAnswer.add(firstMeatPizzaOrder);
                displayScreen.removeFirst(); // Move the window forward
            }
        }

        // Convert ArrayList to array for return
        int[] answer = new int[tempAnswer.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tempAnswer.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int orderPlacedSize = in.nextInt();
        int[] orderPlaced = new int[orderPlacedSize];

        for (int i = 0; i < orderPlacedSize; i++) {
            orderPlaced[i] = in.nextInt();
        }

        int size = in.nextInt();

        int[] result = orderPizza(orderPlaced, size);

        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(result[result.length - 1]);
    }
}