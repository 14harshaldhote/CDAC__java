package day2programs;
import java.util.Scanner;

public class type1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Zero");
        } else if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a == 3) {
            System.out.println("Three");
        } else if (a == 4) {
            System.out.println("Four");
        } else {
            System.out.println("Number is bigger than 5");
        }

       
        scanner.close();
    }
}
