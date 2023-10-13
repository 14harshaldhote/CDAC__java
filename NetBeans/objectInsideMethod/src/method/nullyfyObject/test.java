/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method.nullyfyObject;

public class test {
    
    protected void finalize(){
        System.out.println("Object is destroyed");
    }
    public static void main(String[] args) {
        test t1=new test();
        t1=null;
        System.gc();
    }
}
