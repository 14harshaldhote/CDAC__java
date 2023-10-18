/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
class A{
    void print(){
        System.out.println("A run hora h....!");
    }
}
class B extends A{
    @Override
    void print(){
         System.out.println("B run hora h....!");
    }
    void show(){
        System.out.println("Show() method is running");
    }
}


public class q5{
    public static void main(String[] args) {
        A a=new B();
        a.print();
        
        
        B b=(B)a;
        b.print();
        b.show();
    }
}
 */
package assignments.One;


class A{
    void print(){
        System.out.println("A run hora h....!");
    }
}
class B extends A{
    @Override
    void print(){
         System.out.println("B run hora h....!");
    }
    void show(){
        System.out.println("Show() method is running");
    }
}


public class q5{
    public static void main(String[] args) {
        A a=(A)new B();
        a.print();
        
        
        B b=(B)a;
        b.print();
        b.show();
    }
}


