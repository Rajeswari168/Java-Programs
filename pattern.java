import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n = 5;        
        int s = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print("*");
            }
            System.out.println();
            s += 2;
        }
    }
}
