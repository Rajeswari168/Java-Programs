import java.util.*;
public class Rotten_oranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int time = 0;
        boolean changed = true;
        while (changed) {
            changed = false;
            int temp[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    temp[i][j] = arr[i][j];
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] == 2) {
                        if (i > 0 && arr[i - 1][j] == 1) {
                            temp[i - 1][j] = 2;
                            changed = true;
                        }
                        if (i < r - 1 && arr[i + 1][j] == 1) {
                            temp[i + 1][j] = 2;
                            changed = true;
                        }
                        if (j > 0 && arr[i][j - 1] == 1) {
                            temp[i][j - 1] = 2;
                            changed = true;
                        }
                        if (j < c - 1 && arr[i][j + 1] == 1) {
                            temp[i][j + 1] = 2;
                            changed = true;
                        }
                    }
                }
            }
            if (changed) {
                time++;
            }
            arr = temp;
        }
        boolean fresh = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    fresh = true;
                }
            }
        }
        if (fresh) {
            System.out.println(-1);
        } else {
            System.out.println(time);
        }
    }
}
