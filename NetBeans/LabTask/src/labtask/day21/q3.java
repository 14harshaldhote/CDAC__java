/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day21;

/**
 *
 * @author harshalsMac
 */
public class q3 {
    
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        
       
        myThread.run();
        
        System.out.println("Main method finished.");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable is running.");
        }
    }
}
    

