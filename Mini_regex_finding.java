import java.util.*;
public class Mini_regex_finding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();
        boolean found = false;
        for (int start = 0; start < str.length(); start++) {
            int i = start;
            int j = 0;
            while (j < pattern.length()) {
                // Handle *
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    while (i < str.length() && str.charAt(i) == pattern.charAt(j)) {
                        i++;
                    }
                    j += 2;
                }
                // Handle +
                else if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '+') {
                    if (i >= str.length() || str.charAt(i) != pattern.charAt(j))
                        break;
                    while (i < str.length() && str.charAt(i) == pattern.charAt(j)){
                        i++;
                    }
                    j += 2;
                }
                // Normal character
                else {
                    if (i >= str.length() || str.charAt(i) != pattern.charAt(j))
                        break;
                    i++;
                    j++;
                }
            }
            if (j == pattern.length()) {
                for (int k = start; k < i; k++) {
                    System.out.print(str.charAt(k));
                }
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("No Match");
    }
}