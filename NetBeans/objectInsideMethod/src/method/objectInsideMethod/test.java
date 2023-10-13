/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method.objectInsideMethod;

public class test {
 String objName;
    private static void display() {
        test t2=new test("t2");
    }
   
    public test(String objName) {
        this.objName = objName;
    }
    static void show(){
        test t1=new test("t1");
        display();
    }
    @Override
    protected void finalize()throws Exception{
        System.out.println(this.objName+" is free from memory");
    }
    public static void main(String[] args) {
        show();
        System.gc();
//        Runtime.getRuntime().gc();
    }
}
