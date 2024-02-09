package smallestStockPrice;

import java.util.Arrays;
import java.util.Scanner;

public class smallestStockPrice {

    public static int smallestStockPricee(int[] stock, int valueK) {
        Arrays.sort(stock);
        return stock[valueK - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stockSize = scanner.nextInt();
        int[] stock = new int[stockSize];

        for (int i = 0; i < stockSize; i++) {
            stock[i] = scanner.nextInt();
        }

        int valueK = scanner.nextInt();
        int result = smallestStockPricee(stock, valueK);

        System.out.print(result);
    }
}
