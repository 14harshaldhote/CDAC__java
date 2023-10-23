/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;
import java.util.Arrays;
class operations{
    public static int calSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double calAvg(int[] numbers) {
        int sum = calSum(numbers);
        return (double) sum / numbers.length;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max; 
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}


public class q10 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        int sum = operations.calSum(numbers);
        double average = operations.calAvg(numbers);

        int max = operations.findMax(numbers);
        int min = operations.findMin(numbers);

        System.out.println("Array elements: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    
}
