import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = 1;
        for (int i = 0; i < n; i++) {
            long cur = nums[i];
            int len = 1;
            while (true) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == cur) {
                        count++;
                    }
                }
                if (count < 2)
                    break;
                long next = cur * cur;
                boolean found = false;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == next) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    break;
                len += 2;
                cur = next;
            }
            if (len > ans) {
                ans = len;
            }
        }
        System.out.println(ans);
    }
}
