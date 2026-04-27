import java.util.*;
public class Longest_Substring {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (temp.indexOf(ch) != -1) {
                    break;
                }
                temp += ch;
                max = Math.max(max, temp.length());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = lengthOfLongestSubstring(input);
        System.out.println(result);
    }
}