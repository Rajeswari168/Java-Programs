import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        int temp = sum;
        int rev = 0;
        while (temp > 0) {
            int res = temp % 10;
            rev = rev * 10 + res;
            temp = temp / 10;
        }
        int magic = sum * rev;
        if (original == magic) {
            System.out.print("Magic number");
        } else {
            System.out.print("Not a magic number");
        }
    }
}
