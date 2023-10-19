
package labtask.day14;


public class q1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int access = 6; 

        access(numbers, access);
    }

    public static void access(int[] array, int index) {
        try {
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("The index you tried to access is out of bounds.");
        }
    }
}
