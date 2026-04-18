import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 70 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks < 70) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }
    }
}
