/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relationship.composition;

/**
 *
 * @author harshalsMac
 */

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine type: " + type;
    }
}

class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, String engineType) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(engineType);
    }

    
    @Override
    public String toString() {
        return "Car Make: " + make + ", Model: " + model + "\n" + engine.toString();
    }
}

public class testComp {
    public static void main(String []arr){
        Car car = new Car("Toyota", "Camry", "V6");
        System.out.println(car.toString());
        
    }
    
}
