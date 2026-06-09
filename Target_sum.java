import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int sum = 0;
        for (int x : nums)
            sum += x;
        if (target > sum || target < -sum) {
            System.out.println(0);
            return;
        }
        if ((sum + target) % 2 != 0) {
            System.out.println(0);
            return;
        }
        int s = (sum + target) / 2;
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = s; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        System.out.println(dp[s]);
    }
}
