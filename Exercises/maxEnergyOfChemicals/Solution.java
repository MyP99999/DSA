import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {

    public static int maxEnergy(int[] ener) {
        int maxProduct = Integer.MIN_VALUE;
        int sumOfMaxEnergies = 0;

        for (int i = 0; i < ener.length; i++) {
            for (int j = i + 1; j < ener.length; j++) {
                int product = ener[i] * ener[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    sumOfMaxEnergies = ener[i] + ener[j];
                }
            }
        }

        return sumOfMaxEnergies;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input for ener
        int ener_size = in.nextInt();
        int[] ener = new int[ener_size];
        for(int idx = 0; idx < ener_size; idx++) {
            ener[idx] = in.nextInt();
        }

        int result = maxEnergy(ener);
        System.out.println(result);
    }
}
