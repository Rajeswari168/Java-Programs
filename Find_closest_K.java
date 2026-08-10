import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        // Find the position where x can be inserted
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // left = first element >= x
        int i = left - 1;
        int j = left;
        int[] result = new int[k];
        int index = 0;
        // Select k closest elements
        while (index < k) {
            if (i < 0) {
                result[index++] = arr[j++];
            }
            else if (j >= n) {
                result[index++] = arr[i--];
            }
            else {
                int leftDiff = Math.abs(arr[i] - x);
                int rightDiff = Math.abs(arr[j] - x);
                // If equal distance, choose smaller value
                if (leftDiff <= rightDiff) {
                    result[index++] = arr[i--];
                } else {
                    result[index++] = arr[j++];
                }
            }
        }
        // Sort result in ascending order
        Arrays.sort(result);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
