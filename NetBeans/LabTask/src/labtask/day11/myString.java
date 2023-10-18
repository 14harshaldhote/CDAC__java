/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day11;

import java.util.Arrays;

public class myString {
    
    String str = "hello from Soft polynomial, we are here to Elaborate";
    
    static String email="dhoteharshal16@gmail.com";
    static String email1="dhoteharshal16@gmail.com";
    static String email2="dhoteHarshal16@gmail.com"; 
    static String email3="milindGaba@gmail.com"; 
    
    public static void main(String[] args) {
        myString s = new myString();
        myString v=new myString();
        System.out.println(s.str);
        System.out.println(s.str.indexOf('e'));
        System.out.println(s.str.indexOf('e',2));
        System.out.println(s.str.lastIndexOf('o'));
        System.out.println(s.str.lastIndexOf('o',11));
        String[] splitArray = s.str.split("o");
        System.out.println(Arrays.toString(splitArray));        
        
        String[] splitArra = s.str.split("o",4);
        System.out.println(Arrays.toString(splitArra));   
        
        System.out.println(s.str.charAt(6));
        
        System.out.println(s.str.toCharArray());
        
        
        String str1= " ";
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());
        
        
        
        System.out.println(v.email.compareTo("dhoteharshal16@gmail.com"));
        System.out.println(v.email.compareTo(email));
        System.out.println(v.email.compareTo(email1));
        System.out.println(v.email.compareTo(email2));
        System.out.println(v.email.compareTo("dhoteHarshal16@gmail.com"));
        System.out.println(v.email1.compareTo(email2));
        System.out.println(v.email3.compareTo(email2));
        //System.out.println(v.email1.equal("dhoteHarshal16@gmail.com"));  
        
        
        
    }
}
