/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author harshalsMac
 */
public class syncThread implements Runnable{
    static int x=0;
    @Override
    public void run(){
        //synchronized(this){
        for(int i=0;i<100;i++){
           // System.out.println(i);
            
            x++;
            x--;
        }
    }
//}
    
    
    
    public static void main(String [] ar){
        
        syncThread s=new syncThread();
        
        Thread t1[]=new Thread[1000];
        for(int i=0;i<t1.length;i++){
            t1[i]=new Thread(s);
            t1[i].start();
        }
        
        System.out.println("Final value of x is : "+x);
        
        
    }

   
    
}
