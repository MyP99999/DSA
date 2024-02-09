import java.util.*;

public class CommonPrefix2 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Find the string with the minimum length
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean isCommonPrefix(String[] strs, int length) {
        String str1 = strs[0].substring(0,length);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // Number of names
        String[] names = new String[n];
        
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next().toLowerCase();
        }

        String result = longestCommonPrefix(names);
        System.out.println(result);
        
        scanner.close();
    }
}
