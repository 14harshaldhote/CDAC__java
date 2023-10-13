/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day7;

//Create an Array of Employee class and initialize array elements with different employee objects.

class infoemp{
    String name;
    int id;
    {
    int a=10;}
    
    public infoemp(String a,int b){
           name=a;
           id=b;
    }
}


public class employee {
    public static void main(String arr[]){
        infoemp o[]=new infoemp[5];
        o[0]= new infoemp("vaibhav",1212);
        o[1]= new infoemp("vaib",1252);
        o[2]= new infoemp("vahav",1412);
        o[3]= new infoemp("bhav",1242);
        o[4]= new infoemp("aibhav",1712);
        
        for(int i=0; i<5; i++){
        
        System.out.println("name : "+o[i].name+" id : "+o[i].id );
    }
    
    
}}
