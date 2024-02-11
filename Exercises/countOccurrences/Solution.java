package countOccurrences;

import java.util.Scanner;

public class Solution {

    public static int countOccurrences(String parent, String sub) {
        int count = 0;
        int fromIndex = 0;

        while ((fromIndex = parent.indexOf(sub, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parent = scanner.nextLine();
        String sub = scanner.nextLine();

        System.out.println(countOccurrences(parent, sub));
    }
}
