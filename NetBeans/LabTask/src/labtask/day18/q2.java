/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day18;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author harshalsMac
 */
public class q2 {
     public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Fourth");
        
        System.out.println("Queue elements: " + queue);

        String removedElement = queue.poll();
        System.out.println("Dequeued element: " + removedElement);

        System.out.println("Queue after dequeue: " + queue);

        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        int size = queue.size();
        System.out.println("Queue size: " + size);
    }
}
    

