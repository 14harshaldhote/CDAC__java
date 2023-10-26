/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;


public class studentComperator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getName().compareTo(o2.getName());
    }
}
    

    

