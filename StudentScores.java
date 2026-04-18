import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfStudents = 5;
        
        int[] scores = new int[numberOfStudents];
        int sum = 0;
        int lowestScore = Integer.MAX_VALUE;
        int highestScore = Integer.MIN_VALUE;

        // Collect scores from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            }
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }

        double averageScore = (double) sum / numberOfStudents;

        // Display all scores
        System.out.print("Scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        // Display average, lowest, and highest scores
        System.out.println("Average Score: " + averageScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Highest Score: " + highestScore);

        scanner.close();
    }
}
