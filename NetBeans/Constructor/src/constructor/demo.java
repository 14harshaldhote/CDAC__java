/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author harshalsMac
 */
public class demo {
   int a;
    demo(){
         a=10;
    }
    demo(int x){
        a=x;
    }
    
  
    public static void main (String []args){
        demo d=new demo();
        demo d1=new demo(50);
        System.out.println(d.a);
        System.out.println(d1.a);
        
    }
    
    
    
    
}
// demo d;   d.function name();