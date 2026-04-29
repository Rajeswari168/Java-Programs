import java.util.*;
public class Gas_station {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++){
            gas[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
        }
        int total = 0, curr = 0, start = 0;
        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            curr += diff;
            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }
        if (total >= 0){
            System.out.println(start);
        }
        else{
            System.out.println(-1);
        }
    }
}