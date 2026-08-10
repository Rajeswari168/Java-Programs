import java.util.*;
public class Main {
    static boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = arr[i] + arr[j];
                String s2 = arr[j] + arr[i];
                if (palindrome(s1) || palindrome(s2)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
