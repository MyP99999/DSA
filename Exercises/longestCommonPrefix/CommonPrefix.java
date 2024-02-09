import java.util.*;

public class CommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }        
        return prefix;
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
    }
}
