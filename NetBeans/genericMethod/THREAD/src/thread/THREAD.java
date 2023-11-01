/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread;

/**
 *
 * @author harshalsMac
 */
public class THREAD extends Thread{
    @Override
    public void run(){
        for(int i=1;i<10;i++){
            if(this.getName().equals("thread two")){
                try{
                    sleep(1000);
                    
                }catch(Exception e){}
            }
            System.out.println(getName()+ " "+i);
        }
        
    }

    
    public static void main(String[] args) {
        THREAD t1= new THREAD();
        THREAD t2= new THREAD();
        t1.setName("thread one");
        t2.setName("thread two");
        
        System.out.println(t1.getPriority());
        
        System.out.println(t2.getPriority());
        
        t1.setPriority(2);
         System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){}
    
            System.out.println("Main thread exited......");
        /*THREAD t1= new THREAD();
        THREAD t2= new THREAD();
        t1.setName("thread one");
        t2.setName("thread two");
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
        }
        catch(Exception e){}
    
            System.out.println("Main thread exited......");*/
    }
    
}
