import java.util.Scanner;
public class Bank {
public static void main(String[] args) {
Scanner b = new Scanner(System.in);
System.out.print("Enter your current balance: ");
double currentBalance = b.nextDouble();
System.out.print("Enter the amount you wish to withdraw: ");
double withdrawalAmount = b.nextDouble();
if (withdrawalAmount > currentBalance) {
System.out.println("Error: Insufficient balance.");
} 
else {
currentBalance -= withdrawalAmount;
System.out.println("Withdrawal successful. New balance: " + currentBalance);
}
 }
}
