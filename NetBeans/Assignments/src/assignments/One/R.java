/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;

/**
 *
 * @author harshalsMac
 */
public class R {
     public static void main(String[] args) {
        int height = 7; 
    for (int i = 1; i <= height; i++) {
            System.out.print(" * ");

            for (int j = 1; j <= height - 1; j++) {
                if ((i == 1 || i == height / 2) && j < height - 1) {
                    System.out.print(" * ");
                } else if (j == height - 2 && i != 1 && i != height ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            if (i != 1)
                System.out.print("*");

            System.out.println();
        }
    }
}
    

