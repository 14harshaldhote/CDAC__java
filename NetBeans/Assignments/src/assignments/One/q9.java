/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;

/**
 *
 * @author harshalsMac
 */

class KPatternGenerator {
    public static void generateKPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == j && j >= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print("K");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class q9 {
    public static void main(String[] args) {
        int n = 10; 
        KPatternGenerator.generateKPattern(n);
    }
}
