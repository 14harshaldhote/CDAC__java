

/**
 *Write a generic method to count the number of elements in a collection that have a
specific property (for example, odd integers, prime numbers, palindromes).
 */

package labtask.day22;

import java.util.Collection;
import java.util.List; // Add this import statement
import java.util.function.Predicate;

public class q1 {
    public static <T> long ep(Collection<T> collection, Predicate<T> pc) {
        long count = 0;
        for (T element : collection) {
            if (pc.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long countOddNumbers = ep(numbers, n -> n % 2 != 0);
        System.out.println("Count of odd numbers: " + countOddNumbers);

        long pn = ep(numbers, q1::isPrime);
        System.out.println("Count of prime numbers: " + pn);

        Collection<String> words = List.of("radar", "hello", "level", "world");
        long pa = ep(words, q1::isPalindrome);
        System.out.println("Count of palindromes: " + pa);
    }

    public static boolean isPrime(Integer number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
