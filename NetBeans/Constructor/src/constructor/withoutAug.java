/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author harshalsMac
 */
class Car {

    private String make;
    private String model;
    private int year;

    public Car() {
        make = "Mazda";
        model = "Viper";
        year = 2002;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String describe() {
        return "This is a " + year + " " + make + " " + model + ".";
    }

 
}

public class withoutAug {
     public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2022);

        System.out.println(car1.describe());
        System.out.println(car2.describe());
    }
    
    
}
