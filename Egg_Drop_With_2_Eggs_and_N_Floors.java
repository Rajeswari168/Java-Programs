import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int moves = 0;
        int coveredfloor = 0;
        while (coveredfloor < n) {
            moves++;
            coveredfloor += moves;
        }
        System.out.println(moves);
    }
}
