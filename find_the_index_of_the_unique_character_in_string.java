import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
