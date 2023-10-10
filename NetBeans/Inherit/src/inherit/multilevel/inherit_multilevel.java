/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit.multilevel;

/**
 *
 * @author harshalsMac
 */

class GrandParent{
    int x=10;
    void test(){
        System.out.println(x);
    }
}
class Parent extends GrandParent{
    int b=30;
    void tesr(){
        System.out.println(b);
    }
}
class child extends Parent{
    int a=40;
    void sm(){
        System.out.println(a);
    }
    
}
public class inherit_multilevel {
    public static void main(String []arr){
        child c=new child();
        
        c.test();
        c.tesr();
        c.sm();
    }
    
}
