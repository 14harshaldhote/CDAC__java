/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectinsidemethod;


public class ObjectInsideMethod {

    String str;

    public ObjectInsideMethod(String str) {
        this.str = str;
    }

    private static void display() {
        ObjectInsideMethod t2 = new ObjectInsideMethod("t2");
        System.gc();
    }

    protected void finalize() {
        System.out.println("Finalizing object with str: " + str);
        
    }

    public static void main(String[] args) {
        ObjectInsideMethod t1 = new ObjectInsideMethod("t1");
        System.out.println("Inside main method: " + t1.str);
        display();
    }
}
