/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection.QueueTest;

import java.util.PriorityQueue;
import java.util.Vector;
import testcollection.Student;

/**
 *
 * @author harshalsMac
 */
public class queueStudent {
    public static void main(String[] args) {
        PriorityQueue<Student> v = new PriorityQueue<>(new studentComperator());
        Student s1 = new Student(101, "Ramesh", 23);
        Student s2 = new Student(102, "Bhavesh", 24);
        Student s3 = new Student(105, "Maheshh", 25);
        Student s4 = new Student(103, "Dinesh", 21);

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
         System.out.println("---------------------------------\n\n");
        System.out.println(v);
        System.out.println("---------------------------------\n\n");
        
        PriorityQueue<Student> v1 = new PriorityQueue<>(new studentCollectorAge());
         v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        System.out.println("---------------------------------\n\n");
        System.out.println(v1);
        
        System.out.println("---------------------------------\n\n");
        
        
        
        
}
}