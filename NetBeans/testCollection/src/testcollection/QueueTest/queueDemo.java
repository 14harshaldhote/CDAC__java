/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection.QueueTest;

import java.util.PriorityQueue;
import java.util.Queue;

/**
  String p1=q.poll();
        System.out.println(p1);
        System.out.println(q);
        
        
        
    Queue<String> q1=new PriorityQueue<>();
    q1.add("Abc");
    q1.add("mno");
    q1.add("xyz");
    
        System.out.println(q1);
 */
public class queueDemo {
    
    public static void main(String[] args) {
        
    
    Queue<String> q=new PriorityQueue<>();
    q.add("Raju");
    q.add("Rajesh");
    q.add("Nilu");
    q.add("Reshma");
    q.add("Manohar");
    q.add("Akshay");
    
    
        System.out.println(q);
        System.out.println("Queue's head: " + q.element());
        
        
        q.poll();
        q.poll();
        q.poll();
        
           System.out.println(q);
}
    
    
}
