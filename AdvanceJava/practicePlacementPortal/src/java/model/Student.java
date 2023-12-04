/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Student {
    protected int id;
    protected String name;
    protected int age;
    protected String address;
    protected int phone;
    protected String state;
    
    public void Student(){
        
    }

    public Student(int id, String name, int age, String address, int phone, String state) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.state = state;
    }

    public Student(String name, int age, String address, int phone, String state) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.state = state;
    }
    
    
}
