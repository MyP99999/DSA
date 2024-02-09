import java.util.Scanner;

public class ProductTemperature {
    public static int ProductsAsNegativeTemp(int[] temperature) {
        int answer = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of products
        int numOfProducts = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        // Read the temperatures and count the products with negative temperature
        int[] temperatures = new int[numOfProducts];

        // Read the temperatures into the array
        for (int i = 0; i < numOfProducts; i++) {
            temperatures[i] = scanner.nextInt();
        }

        // Output the count of products that need to be preserved at negative
        // temperatures
        System.out.println(ProductsAsNegativeTemp(temperatures));
    }
}
