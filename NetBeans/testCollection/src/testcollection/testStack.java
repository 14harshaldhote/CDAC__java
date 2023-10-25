/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author harshalsMac
 */
public class testStack {
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        
//        s.push("newlist 1");
//        s.push("newlist 2");
          s.push(3);
          s.push(4);
          s.push(7);
          s.push(3);
          s.push(4);
          s.push(7);
        System.out.println(s);
       // String element = s.pop();
      
      s.pop();
      s.pop();
      Integer e=s.peek();
      
       System.out.println(s);
       System.out.println(e);
      
        
        
    }
    
}
