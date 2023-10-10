/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relationship.Association;




class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public Person() {
        name = "Harshal";
        address = new Address(56, "gg Street", "Cityville", "12345");
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

public class newJ {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", new Address(123, "Main St", "Anytown", "54321"));
        person1.printDetails();
 
        System.out.println();

        Person person2 = new Person();
        person2.printDetails();
    }
}
