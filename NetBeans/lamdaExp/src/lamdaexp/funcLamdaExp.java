/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lamdaexp;

/**
 *
 * @author harshalsMac
 */

@FunctionalInterface
interface LengthFinder {
    int strLength(String str);
}

public class funcLamdaExp {
    public static void main(String[] args) {
        LengthFinder lf = (str) -> str.length();
        System.out.println("Length is: " + lf.strLength("Give length"));
        
        
        
        
        //THREAD 
        //lamda expression
        Runnable r = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   // Logger.getLogger(funcLamdaExp.class.getName()).severe("Thread interrupted.");
                }
            } 
        };
        
        
        //Annonymous class
        
        Runnable r1=new Runnable(){
            public void run(){
            for (int i = 0; i <= 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //Logger.getLogger(funcLamdaExp.class.getName()).severe("Thread interrupted.");
                }
            }
            }
        };
        
        
        r.run();
        r1.run();
    }
}