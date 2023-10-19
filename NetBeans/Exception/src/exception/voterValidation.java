/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author harshalsMac
 */
import java.util.Scanner;
public class voterValidation  {
    void checkValidity(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Age : ");
        int a=sc.nextInt();
        
        if(a>=18){
            System.out.println("Congarts ur eligible for making voter ID");
        }
        else{
            
            try{
            throw new p3Exception("Vedd ahe Thambun jaa tu");
            
            }
            catch(p3Exception e){
                System.out.println(e.getMessage());
                
            }
        }
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
