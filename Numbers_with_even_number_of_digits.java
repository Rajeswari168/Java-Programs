import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digits = 0;
            while (num > 0) {
                digits++;
                num = num / 10;
            }
            if (digits % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
}
