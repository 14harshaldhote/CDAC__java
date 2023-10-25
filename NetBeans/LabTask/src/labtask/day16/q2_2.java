/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author harshalsMac
 */
public class q2_2 {
  
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in the dd/MM/yyyy format: ");
        String dateString = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date parsedDate = sdf.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter a date in the dd/MM/yyyy format.");
        }
    }
}