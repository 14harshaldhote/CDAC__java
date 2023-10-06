/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mandir;
import java.util.*;

/**
 *
 * @author harshalsMac
 */
public class Mandir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int numRows = 10;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows; j++) {
                if (j == 1 || i == numRows) {
                    System.out.print("|");
                } else if (j == i) {
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}