/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattrens;

/**
 *
 * @author harshalsMac
 */
public class mandir {
 public static void main(String[] args) {
        int numRows = 15; 

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows; j++) {
                if ((i == 1 && (j == 1 || j == 5)) ||
                    (i >= 2 && i <= 5 && j == 3) ||
                    (i == 6 && (j >= 2 && j <= 6)) ||
                    (i >= 7 && i <= 9 && j == 1) ||
                    (i >= 7 && i <= 9 && j == 7) ||
                    (i == 10 && (j >= 2 && j <= 6)) ||
                    (i >= 11 && i <= 15 && j == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}