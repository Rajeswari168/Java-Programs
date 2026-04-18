import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
     }
}
