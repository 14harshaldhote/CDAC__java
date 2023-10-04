package day2programs;
import java.util.Scanner;

public class secondif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (a > 5) {
            if (a < 10) {
                System.out.println("Number is greater than 5 and less than 10");
            } else {
                System.out.println("Number is greater than or equal to 10");
            }
        } else {
            System.out.println("Number is not greater than 5");
        }

        scanner.close();
    }
}
