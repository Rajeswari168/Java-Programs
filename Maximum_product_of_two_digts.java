import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
            n = n / 10;
        }
        System.out.println(max1 * max2);
    }
}
