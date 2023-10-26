/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author harshalsMac
 */
public class studentCollection {

    public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        Student s1 = new Student(101, "Ramesh", 23);
        Student s2 = new Student(102, "Bhavesh", 24);
        Student s3 = new Student(105, "Maheshh", 25);
        Student s4 = new Student(103, "Dinesh", 21);

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);

        System.out.println(v.get(1).getName());
        System.out.println(v.get(2).getName());

        System.out.println("---------------------------------");

        Collections.sort(v);
        studentComperator sc = new studentComperator();
        Collections.sort(v, sc);
        Iterator<Student> i = v.iterator();
        while (i.hasNext()) {
            Student student = i.next();
            System.out.println("Id: " + student.getId() + "Name: " + student.getName() + "Age: " + student.getAge());

        }
        System.out.println("---------------------------------\n");
        studentCollectorAge scAge = new studentCollectorAge();
        Collections.sort(v, scAge);
        Iterator<Student> it = v.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println("Id: " + student.getId() + "Name: " + student.getName() + "Age: " + student.getAge());

        }
    }
}
