/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day18;

import java.util.ArrayDeque;

/**
 *
 * @author harshalsMac
 */
public class q5 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(10);
        arrayDeque.addLast(20);
        arrayDeque.addLast(30);
        arrayDeque.addFirst(5);
        arrayDeque.addFirst(15);
        
        System.out.println("Elements in ArrayDeque:");
        for (Integer element : arrayDeque) {
            System.out.println(element);
        }
    }
}
