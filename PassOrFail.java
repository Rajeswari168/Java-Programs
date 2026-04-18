import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = scanner.nextInt();
        String result = (mark >= 50) ? "Passed" : "Failed";
        System.out.println("You have " +result+".");
}
}
