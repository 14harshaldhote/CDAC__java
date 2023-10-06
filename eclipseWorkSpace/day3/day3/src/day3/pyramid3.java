package day3;

public class pyramid3 {
    public static void main(String[] args) {
        int size = 5; // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            for (int j = 0; j < 2 * (size - i - 1) - 1; j++) {
                System.out.print("  ");
            }

            System.out.print("* ");
            System.out.println();
        }
    }
}