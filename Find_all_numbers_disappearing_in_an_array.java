import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            present[arr[i]] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
