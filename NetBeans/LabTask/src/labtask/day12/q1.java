/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day12;

/**
 *
 * @author harshalsMac
 */
public class q1 {
    public static void main(String[] args) {
        
        int pInt = 42;
        Integer wInt = pInt;

        System.out.println("Autoboxing: int to Integer");
        System.out.println("Primitive int: " + pInt);
        System.out.println("Wrapped Integer: " + wInt);

        
        Integer wValue = new Integer(100);
        int unwInt = wValue;

        System.out.println("\nUnboxing: Integer to int");
        System.out.println("Wrapped Integer: " + wValue);
        System.out.println("Unwrapped int: " + unwInt);
    }
}
    

