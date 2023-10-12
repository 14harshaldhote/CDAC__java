
package testinterface;


interface PerimeterCalculator {
    double calculatePi();
    double calculate3_14();
    double calculate22Over7();
}

class Moon implements PerimeterCalculator {
    @Override
    public double calculatePi() {
       
        double radius = 10.0; 
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculate3_14() {
    
        double radius = 10.0; 
        return 2 * 3.14 * radius;
    }

    @Override
    public double calculate22Over7() {
    
        double radius = 10.0; 
        return 2 * (22.0 / 7.0) * radius;
    }
}

public class MoonMain {
    public static void main(String[] args) {
        Moon moon = new Moon();

        double perimeter1 = moon.calculatePi();
        double perimeter2 = moon.calculate3_14();
        double perimeter3 = moon.calculate22Over7();

        System.out.println("Perimeter using full pi: " + perimeter1);
        System.out.println("Perimeter using pi as 3.14: " + perimeter2);
        System.out.println("Perimeter using pi as 22/7: " + perimeter3);
    }
}
