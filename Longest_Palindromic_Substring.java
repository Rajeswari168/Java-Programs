import java.util.*;
class Main {
    public static boolean isPalindrome(String s) {
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
        String str = sc.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = str.substring(i, j + 1);
                if (isPalindrome(s) && s.length() > ans.length()) {
                    ans = s;
                }
            }
        }
        System.out.println(ans);
    }
}
