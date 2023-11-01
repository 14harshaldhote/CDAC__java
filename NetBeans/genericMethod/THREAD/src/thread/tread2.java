/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author harshalsMac
 */
public class tread2 implements Runnable{
   public void run(){
       for(int i=1;i<10;i++){
           System.out.println(Thread.currentThread().getName()+" "+i);
       }
       
   } 
    
    
    
    public static void main(String[] args) {
        tread2 t1=new tread2();
        tread2 t2=new tread2();
        
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        
        th1.setName("thread one");
        th2.setName("thread two");
        
        th1.start();
        th2.start();
    }
    
}
