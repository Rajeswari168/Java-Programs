import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (n < 2) {
            System.out.println(0);
            return;
        }
        Arrays.sort(nums);
        int maxGap = 0;
        for (int i = 1; i < n; i++) {
            int gap = nums[i] - nums[i - 1];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        System.out.println(maxGap);
    }
}
