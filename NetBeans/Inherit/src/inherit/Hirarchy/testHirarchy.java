/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit.Hirarchy;

/**
 *
 * @author harshalsMac
 */
class parent {
    void par(){
        System.out.println("we are Father and mother");
        
    }
    
}
class child1 extends parent{
    void ch1(){
        System.out.println("im the oldest child my name is Rakesh");
    }
}
class child2 extends parent{
    void ch2(){
        System.out.println("im the youngest child my name is Mukul");
    }
}
public class testHirarchy {
    public static void main(String []arr){
        child1 c1=new child1();
        child2 c2= new child2();
        c1.par();
        c1.ch1();
        
        c2.par();
        c2.ch2();
    }
    
}
