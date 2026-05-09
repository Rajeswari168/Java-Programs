import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(matrix[i][j]);
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
