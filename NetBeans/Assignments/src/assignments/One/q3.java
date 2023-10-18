/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;

import java.util.Scanner;

abstract class Instrument{
    abstract void play();
        
    abstract void tune();
    
}


class Piano extends Instrument{
    void play(){
        System.out.println("Playing the piano.. .PA PA PA");
        
    }
    void tune(){
        System.out.println("Tuning the piano...Paa Paa");
    }
    
}
class Guitar extends Instrument{
    void play(){
        System.out.println("Playing the guitar...GA GA GAAAAAAA");
        
    }
    void tune(){
        System.out.println("Tuning the guitar...gaa gaaa");
        
    }
    
}
public class q3 {
    public static void main(String[] args) {
    
    Instrument piano = new Piano();
        Instrument guitar = new Guitar();

        piano.tune();
        piano.play();

        guitar.tune();
        guitar.play();
    
    
}
}