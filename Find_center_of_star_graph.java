import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] edges = new int[n][2];
        for (int i = 0; i < n; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        int result;
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            result = edges[0][0];
        } else {
            result = edges[0][1];
        }
        System.out.println(result);
    }
}
