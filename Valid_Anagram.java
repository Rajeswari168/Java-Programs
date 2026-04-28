import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();   
        String t = sc.next();   
        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
