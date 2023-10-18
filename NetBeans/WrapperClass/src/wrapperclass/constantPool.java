/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapperclass;

/**
 *
 * @author harshalsMac
 */
public class constantPool {
    public static void main(String[] args) {
        
        Byte b1=Byte.valueOf("50");
        Byte b2=Byte.valueOf("50");
        
        
        System.out.println(b1==b2);
        Byte b3=Byte.valueOf("-20");
        Byte b4=Byte.valueOf("50");
        
        
        System.out.println(b3==b4);
        
        Integer i1=Integer.valueOf("8");
        Integer i2=Integer.valueOf("8");
        System.out.println(i1==i2);
        
        
        
        
        
        Short s1=Short.valueOf("-128");
        Short s2= Short.valueOf("-128");
         System.out.println(s1==s2);
         
         
         Boolean a1=Boolean.valueOf("False");
         Boolean a2=Boolean.valueOf("False");
         System.out.println(a1==a2);
         
         
         Float f1=Float.valueOf("334.23");
         Float f2=Float.valueOf("334.23");
         System.out.println(f1==f2);
         
         
         Character c1=Character.valueOf('\u0041'); // unicode of value A is \u0041
         Character c2=Character.valueOf('A');
         System.out.println(c1==c2);
         
         Character c3=Character.valueOf('\u0950'); 
         Character c4=Character.valueOf('\u0950');
         System.out.println(c3==c4);
         
         Character c5=Character.valueOf('\u0950'); 
         
         System.out.println(c5);
         
         
         
        
        
        System.out.println("hello");
    }
    
}
