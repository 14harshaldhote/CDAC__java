/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day6;
//Write a Java program to demonstrate Overriding and Access-Modifiers.

class Animal {
    protected String species;

    public Animal() {
        species = "Unknown";
    }

    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }

    protected void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal {
    public Dog() {
        species = "Dog";
    }

   
    public void makeSound() {
        System.out.println("Dog barks.");
    }

 
    public void displayDogSpecies() {
        displaySpecies();
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        
        animal.makeSound(); 
        dog.makeSound();    

        dog.displayDogSpecies(); 
    }
}
