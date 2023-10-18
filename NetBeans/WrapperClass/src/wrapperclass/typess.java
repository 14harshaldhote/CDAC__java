/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapperclass;


public class typess {
    
    public static void main(String [] ar){
        
        int a=10; //primitive data
        //now convering primtive to refrence
        
        /*
        
        Integer i=new Integer(a); // i is the refrence of primitive data
        
        int x=i.intValue();
        
        */
        
        Integer i=a; //auto boxing
        int x=i; //auto unboxing
   
        System.out.println("Primitive x as a = "+a);
         
        System.out.println("Primitive x as ref(i)= "+i);
        
        
        
        
        String age="23";
        System.out.println(age+5);
        int age1=Integer.parseInt(age);
        System.out.println(age1+5);
        
        String age2="23.65";
        System.out.println(age2+5);
        double age3=Double.parseDouble(age2);
        System.out.println(age3+5);
        
    }
    
}
