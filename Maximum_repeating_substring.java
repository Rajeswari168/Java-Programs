import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                int count = 0;
                int index = 0;
                while ((index = s.indexOf(sub, index)) != -1) {
                    count++;
                    index++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    ans = sub;
                }
            }
        }
        System.out.println("Substring: " + ans);
        System.out.println("Count: " + maxCount);
    }
}
