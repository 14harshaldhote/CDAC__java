package day2program;
import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marksArray = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Paper " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marksArray[i];
        }

        double percentage = (double) totalMarks / (5 * 50) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();
    }
}
