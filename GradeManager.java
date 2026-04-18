import java.util.Scanner;

class Student {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    public Student(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }

    public double calculateAverageGrade() {
        return (homeworkGrade + finalExamGrade) / 2;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Homework Grade: " + homeworkGrade);
        System.out.println("Final Exam Grade: " + finalExamGrade);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter homework grade: ");
        double homeworkGrade = scanner.nextDouble();
        System.out.print("Enter final exam grade: ");
        double finalExamGrade = scanner.nextDouble();

        Student student = new Student(name, homeworkGrade, finalExamGrade);

        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}