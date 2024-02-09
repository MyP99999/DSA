package test;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // Number of names
        String[] names = new String[n];
        
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next().toLowerCase();
        }

        String prefix = names[0];

        int result = names[1].indexOf(prefix);
        System.out.println(result);
    }
}
