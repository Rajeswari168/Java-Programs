import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Non-negative integer: ");
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println("The factorial of  " + n + "  is: " + fact);
        
     }
}
