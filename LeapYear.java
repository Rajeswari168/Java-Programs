import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner y= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = y.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
              System.out.println(year + " is a leap year.");
            }
            else {
            System.out.println(year + " is not a leap year.");
}
}
}
}
