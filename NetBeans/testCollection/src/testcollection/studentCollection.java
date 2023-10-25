/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author harshalsMac
 */
public class studentCollection {
   public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        Student s1 = new Student("Ramesh", 23);
        Student s2 = new Student("Bhavesh", 24);
        Student s3 = new Student("Maheshh", 25);
        Student s4 = new Student("Dinesh", 21);

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);

        System.out.println(v.get(1).getName());
        System.out.println(v.get(2).getName());

        Iterator<Student> it = v.iterator();
        while(it.hasNext()){
            System.out.println("Name: " + it.next().getName() + "Age: " + it.next().getAge());
        }
    }
}