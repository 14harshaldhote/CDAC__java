/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectMethod;


class Student{
    private String name;
    private int age;
    
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
    
public class testobj {
    public static void main(String[] args) {
        Student s1=new Student("Devi",15);
        System.out.println(s1);
                
    }
    
    
    
    
}
