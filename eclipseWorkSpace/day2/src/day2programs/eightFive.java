package day2programs;
import java.util.Scanner;

public class eightFive {

   
    static void find() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 8 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 8 and 5.");
        } else if (number % 8 == 0) {
            System.out.println("Divisible by 8, but not by 5.");
        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5, but not by 8.");
        } else {
            System.out.println("Not divisible by either 8 or 5.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
       
        find();
    }
}
