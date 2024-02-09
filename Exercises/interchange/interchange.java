package interchange;

import java.util.Scanner;

public class interchange {
    public static int[] interchange(int[] arr) {
        // Initialize the answer array with the same size as the input array
        int[] answer = new int[arr.length];
    
        // Replace each element with its index
        for (int i = 0; i < arr.length; i++) {
            answer[arr[i]] = i;
        }
    
        return answer;
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // input for arr
    int arr_size = in.nextInt();
    int[] arr = new int[arr_size];
    for (int idx = 0; idx < arr_size; idx++) {
        arr[idx] = in.nextInt();
    }

    int[] result = interchange(arr);
    for (int idx = 0; idx < arr_size; idx++) {
        System.out.print(result[idx] + " ");
    }
}

}
