/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day11;

/**
 *
 * @author harshalsMac
 */
import java.util.Scanner;
public class nullString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputS = scanner.nextLine();

     
        if (inputS == null) {
            System.out.println("The string is null.");
        } else {
          
            if (inputS.isEmpty()) {
                System.out.println("The string is empty.");
            } else {
                System.out.println("The string is neither empty nor null.");
            }
        }
    }
}