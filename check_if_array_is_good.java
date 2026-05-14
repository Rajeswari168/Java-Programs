import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        boolean good = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                good = false;
                break;
            }
        }
        if (nums[n - 1] != n - 1) {
            good = false;
        }
        System.out.println(good);
    }
}
