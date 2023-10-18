/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day11;

import java.util.Scanner;
public class space {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");

        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}