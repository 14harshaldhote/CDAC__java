/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;

/**
 *
 * @author harshalsMac
 */
public class har {
     public static void main(String[] args) {
        int height = 7; 

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            
           
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (j == height - i + 1 || j == height + i - 1 || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
        }
    }
}