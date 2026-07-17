import java.util.*;
public class occurence_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean visited[] = new boolean[n];
        int sum[] = new int[n + 1];
        for(int i = 0; i < n; i++) {
            if(visited[i])
                continue;
            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            sum[count] += arr[i] * count;
        }
        for(int i = 1; i <= n; i++) {
            if(sum[i] != 0) {
                System.out.println(i + " -> " + sum[i]);
            }
        }
    }
}