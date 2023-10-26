/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day18;

import java.util.PriorityQueue;

/**
 *
 * @author harshalsMac
 */
public class q4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(15);
        priorityQueue.offer(2);
        priorityQueue.offer(8);

        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println("Dequeued: " + element);
        }
    }
}
    

