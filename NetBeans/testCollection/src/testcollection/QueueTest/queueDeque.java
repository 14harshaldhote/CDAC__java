/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection.QueueTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class queueDeque {
    public static void main(String[] args) {
        
    
    
    ArrayDeque<String> dq= new ArrayDeque<>();
    dq.add("Saurabh");
    dq.add("Prabhat");
    dq.add("Manishhhh");
    dq.add("Pranali");
    dq.add("Ashima");
    dq.add("Renu");
    dq.add("Onitha");
    dq.add("Nikhil");
    
    System.out.println(dq);
    
    dq.remove();
    System.out.println(dq);
        
    dq.addFirst("Raju");
    System.out.println(dq);
    
    dq.addLast("Mithali");
    System.out.println(dq);
    
    dq.offerFirst("Shashank");
    System.out.println(dq); 
    
    
    
    
    
    
    }
}
