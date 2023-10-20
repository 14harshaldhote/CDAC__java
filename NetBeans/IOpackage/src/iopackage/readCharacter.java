/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iopackage;

/**
 *
 * @author harshalsMac
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class readCharacter  {
   
    
    public static void main(String[] args) {
       char c;
        String input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide a sentence to read character by character (type 'q' to stop): ");

        while (!(input = br.readLine()).equals("q")) {
            int length = input.length();
            System.out.println("Characters in the sentence:");

            for (int i = 0; i < length; i++) {
                c = input.charAt(i); 
                System.out.println(c);
            }

            System.out.println("Provide another sentence or type 'q' to stop: ");
        }
    }
}