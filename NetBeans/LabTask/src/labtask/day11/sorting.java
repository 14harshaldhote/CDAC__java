/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day11;

import java.util.Arrays;
public class sorting {
    
    static String name="Ramesh,Dinsesh,Ganesh,Suresh,Raju,Akshay,RajuKumarRameshwari";
    public static void main(String [] arr){
        
        String n[]=name.split(",");
        
        for(String name:n){
            System.out.println(name);
        }
        System.out.println("------------------------------------");
        for(int i=0;i<n.length;i++){
            for(int j=1; j<n.length;j++){
                if(n[i].compareTo(n[j])>0){
                    String temp;
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                
                }
            }
        } 
        for(String name:n){
            System.out.println(name);
        }
        
    }   
}
