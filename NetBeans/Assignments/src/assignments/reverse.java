/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments;


public class reverse {
    
    static String s = "My Name is Khan";
    
    public static void main(String[] args) {
        reverse r = new reverse();
        StringBuilder reversedString = new StringBuilder(r.s).reverse();
        System.out.println(reversedString);
    }
    
}
