/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcollection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalsMac
 */
public class TestCollection {

    public static void main(String[] args) {
       
     List l=new ArrayList();  
     
     List l2=new  ArrayList();
     l2.add('M');
     l2.add('P');
     l2.add('O');
     l2.add('N');
     
     l.add('A');
     l.add('B');
     l.add('C');
     l.add('A');
     l.add('D');
     
     
     l.add(3,'E');
     l.remove(0);
     
     l.addAll(l2);
     
        System.out.println(l);
        System.out.println(l.get(3));
    }
    
}