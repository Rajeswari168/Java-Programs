import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum = sum + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            sum = sum - s.charAt(i);
        }
        System.out.print((char)sum);
    }
}
