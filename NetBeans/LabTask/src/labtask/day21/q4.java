/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day21;

/**
 *
 * @author harshalsMac
 */
public class q4 {
    
    public static void main(String[] args) {
        int limit = 100; // Set your limit here
        int numThreads = 4; // Number of threads to use

        long primeSum = 0;
        Q4Task[] tasks = new Q4Task[numThreads];
        Thread[] threads = new Thread[numThreads];

        int numbersPerThread = limit / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * numbersPerThread + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * numbersPerThread;
            tasks[i] = new Q4Task(start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Q4Task task : tasks) {
            primeSum += task.getPrimeSum();
        }

        System.out.println("Sum of prime numbers up to " + limit + ": " + primeSum);
    }

    static class Q4Task implements Runnable {
        private final int start;
        private final int end;
        private long primeSum;

        Q4Task(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            primeSum = 0;
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    primeSum += num;
                }
            }
        }

        public long getPrimeSum() {
            return primeSum;
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }

            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}