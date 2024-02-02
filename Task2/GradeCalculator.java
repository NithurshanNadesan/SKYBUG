package SKYBUG.Task2;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter marks obtained in each subject (out of 100)");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . .");
        int totalMarks = 0;
        int numSubjects;
        do {
            System.out.print("\nEnter number of subjects: ");
            numSubjects = scanner.nextInt();
        } while (numSubjects <= 0);
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print(" -> Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                totalMarks += marks;
            } else {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                i--;
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Total marks: " + totalMarks);

        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average percentage: " + String.format("%.2f", averagePercentage) + "%");

        String grade;
        if (averagePercentage >= 80) {
            grade = "Excellent";
        } else if (averagePercentage >= 65) {
            grade = "Very Good";
        } else if (averagePercentage >= 55) {
            grade = "Good";
        } else if (averagePercentage >= 45) {
            grade = "Fair";
        } else if (averagePercentage >= 35){
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

