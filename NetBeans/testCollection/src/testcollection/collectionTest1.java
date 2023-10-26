/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author harshalsMac
 */
public class collectionTest1 {
     public static void main(String[] args) {
        List <Integer> l=new ArrayList<>();
        
     
        
        l.add(23);
        l.add(32);
        l.add(2);
        l.add(89);
        l.add(4);
        
        
        
        System.out.println(l);
        //List<Object> ml = new ArrayList<>();
       
        /* ml.add(s);
        ml.add(l);
        System.out.println(ml);
 */
     
    // Collections.sort(l);
     //System.out.println(l);
     
     
    int po=Collections.binarySearch(l,32);
     System.out.println(po);
     
   /* Collections.sort(l);
    System.out.println(l);
     int po1=Collections.binarySearch(l,49);
     System.out.println(po1);
     */
   
   
   boolean m = Collections.disjoint(l, Arrays.asList(2,200,300));
   System.out.println(m);
   System.out.println(l);
   
    m1;
         m1 = Collection.copy(l,Arrays.asList(5,2,9));
   System.out.println(m1);
   System.out.println(l);
   
     }

   
}
