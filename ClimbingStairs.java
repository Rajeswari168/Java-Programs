import java.util.Scanner;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        if (n <= 2) {
            result = n;
        } else {
            int a = 1;
            int b = 2;
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            result = b;
        }
        System.out.println(result);
    }
}