import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String columnTitle = sc.next();
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        System.out.println(result);
    }
}
