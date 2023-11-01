/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day22;

/**
 *Write a generic method to exchange the positions of two different elements in an
array.
 */

import java.util.Arrays;

public class q2 {
    public static <T> void exchange(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry", "date"};

        System.out.println("Original Arrays:");
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Words: " + Arrays.toString(words));

        exchange(numbers, 1, 3);
        exchange(words, 0, 2);

        System.out.println("\nArrays After Exchanging Elements:");
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Words: " + Arrays.toString(words));
    }
}
