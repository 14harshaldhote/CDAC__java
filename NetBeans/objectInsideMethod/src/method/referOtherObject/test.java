/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method.referOtherObject;

/**
 *
 * @author harshalsMac
 */

public class test {
    String objName;

    public test(String objName) {
        this.objName = objName;
    }
    
    @Override
    protected void finalize()throws Throwable{
        System.out.println(objName+" is destroy");
    }
    public static void main(String[] args) {
        test t1=new test("t1");
        test t2=new test("t2");

        t1=t2;
        System.gc();
        
    }
}
