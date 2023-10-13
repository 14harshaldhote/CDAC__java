/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

/**
 *
 * @author harshalsMac
 */

public class annoynmousMethod {
      protected void finalize(){
        System.out.println("Object is destroyed");
    }
    public static void main(String[] args) {
        new annoynmousMethod();
        System.gc();
    }
}