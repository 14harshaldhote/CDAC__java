/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.ArrayList;
import java.util.List;


public class testArrayList {
    public static void main(String[] args) {
        List <Integer> l=new ArrayList<>();
        List <String> s=new ArrayList<>();
        
        s.add("Ramesh");
        s.add("Dinu");
        s.add("Shamal");
        
        l.add(23);
        l.add(32);
        l.add(2);
        l.add(89);
        l.add(4);
        
        
        
        //System.out.println(l);
        List<Object> ml = new ArrayList<>();
       
        /* ml.add(s);
        ml.add(l);
        System.out.println(ml);
 */
       for (String item : s) {
            ml.add(item);
        }
        
        for (Integer item : l) {
            ml.add(item);
        }

        System.out.println(ml);
    }
}