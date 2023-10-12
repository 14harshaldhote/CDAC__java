/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass.Static;



 class Outter{
     int x=10;
     static class Inner{
         int y= 15;
         void show(){
             System.out.println("Im from ineer static class " +y);
             //System.out.println("Im from ineer static class " +(x+y)); throwss error of non static as x is non static  variable
             
             Outter o=new Outter();//created a object of non staic class
             
             System.out.println("Im from ineer static class " +(o.x+y));//caleed using object of non static 
         }
     }
     void outShow(){
          System.out.println(" im from outer class "+x);
         
     }
    
 }

public class innerClassStatic {
    public static void main(String [] ar){
        Outter o=new Outter();
        o.outShow();
        
        Outter.Inner oi=new Outter.Inner();
        oi.show();
        
        
        
    }
    
    
    
}
