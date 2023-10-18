
package labtask.day11;

import java.util.Scanner;
public class reverse {
    
    
    
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        
        reverse r = new reverse();
        StringBuilder reversedString = new StringBuilder(s).reverse();
        System.out.println(reversedString);
    }
    
}
