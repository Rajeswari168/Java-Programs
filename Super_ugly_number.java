import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] primes = new int[m];
        for (int i = 0; i < m; i++) {
            primes[i] = sc.nextInt();
        }
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] index = new int[m];
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                long value = (long) primes[j] * ugly[index[j]];
                if (value < min) {
                    min = value;
                }
            }
            ugly[i] = (int) min;
            for (int j = 0; j < m; j++) {
                if ((long) primes[j] * ugly[index[j]] == min) {
                    index[j]++;
                }
            }
        }

        System.out.println(ugly[n - 1]);
    }
}
