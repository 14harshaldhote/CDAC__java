/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Producer consusmer is a concept

package thread;

import java.util.Vector;

public class expNotifyWait {

    public static void main(String[] args) {
        final int totalItems = 10;
        final int batchSize = 5;
        ItemBuffer buffer = new ItemBuffer(batchSize);

        Producer producer = new Producer(buffer, totalItems, batchSize);
        Consumer consumer = new Consumer(buffer, totalItems, batchSize);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

class ItemBuffer {
    private Vector<Object> items = new Vector<>();
    private int batchSize;

    public ItemBuffer(int batchSize) {
        this.batchSize = batchSize;
    }

    public synchronized void produce(int batchSize) {
        while (items.size() + batchSize > 10) {
            try {
                // Wait if the buffer is full
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        for (int i = 0; i < batchSize; i++) {
            items.add(new Object());
        }

        System.out.println("Produced " + batchSize + " items. Total items: " + items.size());

        // Notify consumers that new items are available
        notify();
    }

    public synchronized void consume(int batchSize) {
        while (items.size() < batchSize) {
            try {
                // Wait if there are not enough items to consume
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        for (int i = 0; i < batchSize; i++) {
            items.remove(0);
        }

        System.out.println("Consumed " + batchSize + " items. Total items: " + items.size());

        // Notify producers that space is available
        notify();
    }
}

class Producer implements Runnable {
    private ItemBuffer buffer;
    private int totalItems;
    private int batchSize;

    public Producer(ItemBuffer buffer, int totalItems, int batchSize) {
        this.buffer = buffer;
        this.totalItems = totalItems;
        this.batchSize = batchSize;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalItems; i += batchSize) {
            buffer.produce(batchSize);
            try {
                // Sleep for simulation
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private ItemBuffer buffer;
    private int totalItems;
    private int batchSize;

    public Consumer(ItemBuffer buffer, int totalItems, int batchSize) {
        this.buffer = buffer;
        this.totalItems = totalItems;
        this.batchSize = batchSize;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalItems; i += batchSize) {
            buffer.consume(batchSize);
            try {
                // Sleep for simulation
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
