/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;

/**
 *
 * @author harshalsMac
 */


class Teacher {
    private String name;   
    String subject;        
    protected int age;    
    public int salary;     

    public Teacher(String name, String subject, int age, int salary) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.salary = salary;
    }

    public void teach() {
        System.out.println("Teaching a class.");
    }

    protected void metting() {
        System.out.println("Conducting a staff meeting.");
    }
}
class Student {
    String name;  
    int age;      
    protected double grade; 
    public void study() {
        System.out.println("Studying for exams.");
    }
}

public class q6 {
    
    public static void main(String[] args) {
        Teacher t = new Teacher("Sumit Sir", "Java", 35, 500000);
        Student s = new Student();

       
        System.out.println("Teacher's Subject: " + t.subject);
        System.out.println("Teacher's Age: " + t.age);
        System.out.println("Teacher's Salary: " + t.salary);

        t.teach();
        t.metting(); 

        
        System.out.println("Student's Name: " + s.name);
        System.out.println("Student's Age: " + s.age);

        s.study();
    
}}
