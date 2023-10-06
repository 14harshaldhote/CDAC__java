package day3;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i || i == rows - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}








//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of rows for the pyramid: ");
//        int rows = scanner.nextInt();
//        
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
//            }
//            
//            for (int k = 0; k < 2 * i + 1; k++) {
//                if (k == 0 || k == 2 * i || i == rows - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            
//            System.out.println();
//        }
//        
//        scanner.close();
//    }
//}