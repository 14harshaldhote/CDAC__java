/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harshalsMac
 */
// Define an interface for calculating the perimeter of a moon
interface MoonPerimeterCalculator {
    double calculatePerimeterUsingFullPi();
    double calculatePerimeterUsingPiAs3_14();
    double calculatePerimeterUsingPiAs22Over7();
}

// Implement the interface in a class
class Moon implements MoonPerimeterCalculator {
    @Override
    public double calculatePerimeterUsingFullPi() {
        // Use the full value of pi (e.g., Math.PI)
        double radius = 10.0; // Replace with the actual radius of the moon
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculatePerimeterUsingPiAs3_14() {
        // Use pi as 3.14
        double radius = 10.0; // Replace with the actual radius of the moon
        return 2 * 3.14 * radius;
    }

    @Override
    public double calculatePerimeterUsingPiAs22Over7() {
        // Use pi as 22/7
        double radius = 10.0; // Replace with the actual radius of the moon
        return 2 * (22.0 / 7.0) * radius;
    }
}

public class Moon{
    public static void main(String[] args) {
        Moon moon = new Moon();

        double perimeter1 = moon.calculatePerimeterUsingFullPi();
        double perimeter2 = moon.calculatePerimeterUsingPiAs3_14();
        double perimeter3 = moon.calculatePerimeterUsingPiAs22Over7();

        System.out.println("Perimeter using full pi: " + perimeter1);
        System.out.println("Perimeter using pi as 3.14: " + perimeter2);
        System.out.println("Perimeter using pi as 22/7: " + perimeter3);
    }
}
