/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass.nonStatic;

/**
 *
 * @author harshalsMac
 */

class outer{
    
    int x=10;
    
    class Inner{
        int y=20;
        void display(){
            
            System.out.print("No need to create object of outer class "+(x+y));
        }
    }
    
//    private class Inner{
//        int y=20;
//        void display(){
//            
//            System.out.print("No need to create object of outer class "+(x+y));
//        }
//    }  as private is used so this class will not be accesd outside the outer class
}

public class innerClassnonStatic {
    public static void main(String []ar){
        outer oi=new outer();
        outer.Inner obj= oi.new Inner();// with the help of outer object we have created inner class
        obj.display();
    }
    
}
