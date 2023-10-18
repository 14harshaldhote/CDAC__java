/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day12;

/**
 *
 * @author harshalsMac
 */

import java.util.Scanner;
public class q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double v = sc.nextDouble();
        Double sv = square(v);
        
        System.out.println("Original Value: " + v);
        System.out.println("Square Value: " + sv);
    }

    public static Double square(Double num) {
        return num * num;
    }
}
    

