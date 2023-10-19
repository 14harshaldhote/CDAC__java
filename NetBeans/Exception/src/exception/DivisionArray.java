/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

import java.util.Scanner;

public class DivisionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] resultArray = new Double[5]; // Use 'Double' for nullable objects
        int index = 0;

        while (index < resultArray.length) {
            try {
                System.out.println("Enter two numbers for division:");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();

                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    resultArray[index] = null; // Store null for division by zero
                } else {
                    double result = num1 / num2;
                    resultArray[index] = result;
                }

                index++;
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                resultArray[index] = null; // Store null for other errors as well
                index++;
            }
        }

        scanner.close();

        System.out.println("Results:");
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == null) {
                System.out.println("Result " + (i + 1) + ": Error or Division by Zero");
            } else {
                System.out.println("Result " + (i + 1) + ": " + resultArray[i]);
            }
        }
    }
}
