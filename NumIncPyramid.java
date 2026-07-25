import java.util.Scanner;

public class NumIncPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        1
        2 3 4
        3 4 5 6 7
        4 5 6 7 8 5 4 */
    }
}
