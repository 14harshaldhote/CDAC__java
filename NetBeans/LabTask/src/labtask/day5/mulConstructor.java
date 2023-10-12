/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day5;

/**
 *
 * @author harshalsMac
 */
//Create a class with multiple constructors, including a default constructor and a parameterized constructor. Demonstrate how to use each constructor

class Car {
    private String make;
    private String model;
    private int year;
    private String color;

   Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
        color = "Unknown";
    }

     Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        color = "Unknown";
    }

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void mulConstructor(String[] args) {
     
        Car car1 = new Car();
        System.out.println("Car 1 (Default Constructor):");
        car1.displayInfo();

       
        Car car2 = new Car("Toyota", "Camry", 2020);
        System.out.println("\nCar 2 (Make, Model, and Year Constructor):");
        car2.displayInfo();

        
        Car car3 = new Car("Honda", "Civic", 2019, "Blue");
        System.out.println("\nCar 3 (Make, Model, Year, and Color Constructor):");
        car3.displayInfo();
    }
}

