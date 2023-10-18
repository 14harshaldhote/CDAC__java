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
public class q2 {
    
    public static Integer incrementValue(Integer num) {
        return num + 1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        Integer v = sc.nextInt();

        Integer u = incrementValue(v);

        System.out.println("Updated Value: " + u);
    }
    
}
