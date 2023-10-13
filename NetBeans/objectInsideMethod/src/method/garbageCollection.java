/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectinsidemethod;


public class garbageCollection {

    String str;

    public garbageCollection(String str) {
        this.str = str;
    }

    private static void createAndCallMethod1() {
        garbageCollection t1 = new garbageCollection("t1");
        System.out.println("Inside method 1: " + t1.str);
    }

    private static void createAndCallMethod2() {
        garbageCollection t2 = new garbageCollection("t2");
        System.out.println("Inside method 2: " + t2.str);
    }

    protected void finalize() {
        System.out.println("Finalizing object with str: " + str);
        // Custom cleanup logic can be added here
    }

    public static void main(String[] args) {
        createAndCallMethod1();
        createAndCallMethod2();
        System.gc(); // Manually trigger garbage collection
    }
}
