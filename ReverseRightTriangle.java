import java.util.Scanner;

public class ReverseRightTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // i = 1, j = n
        // i =2, j = n-1
        int n = s.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
