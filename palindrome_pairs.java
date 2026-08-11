import java.util.*;
public class palindrome_pairs {
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String res = arr[i] + arr[j];
                if (isPalindrome(res)) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}