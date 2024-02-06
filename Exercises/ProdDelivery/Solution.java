import java.util.*;

public class Solution {

    public static int[] prodDelivery(int[] orderID) {
        int[] answer = new int[orderID.length];
        
        // Iterate through each order ID
        for (int i = 0; i < orderID.length; i++) {
            // Assuming each digit in orderID represents a product count
            int currentOrder = orderID[i];
            int sum = 0;
            
            // Sum the digits of the order ID to get the total products for the order
            while (currentOrder > 0) {
                sum += currentOrder % 10;
                currentOrder /= 10;
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfClients = scanner.nextInt();
        int[] orderIDs = new int[numOfClients];
        
        for (int i = 0; i < numOfClients; i++) {
            orderIDs[i] = scanner.nextInt();
        }
        
        int[] result = prodDelivery(orderIDs);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
        
        scanner.close();
    }
}