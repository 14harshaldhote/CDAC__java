package pattrens;
import java.util.Scanner;

public class Pattrens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        hollow(numRows);
    }

    public static void hollow(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == numRows) {
                    System.out.print("*");
                    
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
