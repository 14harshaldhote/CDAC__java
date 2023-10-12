/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day5;

/**
 *
 * @author harshalsMac
 */

class sum{
    private int n,m;
    
    public sum(int v1,int v2){
        m=v1;
        n=v2;
    }
    void display(){
        System.out.println("number 1: " + m);
        System.out.println("number 2: " + n);
    }
    
    
}
public class paramConstructor {
    public static void main(String []ar){
        sum s=new sum(15,50);
        s.display();
    }
    
}
