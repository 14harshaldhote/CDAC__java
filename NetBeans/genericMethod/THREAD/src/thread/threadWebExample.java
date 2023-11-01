/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.io.*;
import java.net.*;


public class threadWebExample implements Runnable{
    private String url;
    
    public threadWebExample(String url){
        this.url=url;
        
    }
    
    @Override
    public void run(){
         try {
            URL wp = new URL(url);
            wp.openStream(); 
            System.out.println("Visited: " + url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//        try{
//            URL wp=new URL(url);
//            
//            BufferedReader bf=new BufferedReader(new InputStreamReader(wp.openStream()));
//            
//            String in;
//            while((in=bf.readLine())!=null){
//                System.out.println(in);
//            }
//            bf.close();
//            
//            
//        }
//        catch(Exception e){}
        
        
    
    
    
    public static void main(String[] ar){
        
       // threadWebExample twe=new threadWebExample(url);
         String[] urls = {
            "https://www.google.com",
            "https://www.openai.com",
            "https://era.mkcl.org/lms/#/17771092653531958716",
            "https://www.reddit.com/"
        };
        
         for (String url : urls) {
            Thread t = new Thread(new threadWebExample(url));
            t.start();
            try {
                Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        
        
        
        
        
        
    }
    
}
