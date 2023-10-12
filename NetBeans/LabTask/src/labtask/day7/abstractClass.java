/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day7;

/**
 *
 * @author harshalsMac
 */
abstract class Person {
    public abstract void eat();
    public abstract void exercise();
}

class Athlete extends Person {
    @Override
    public void eat() {
        System.out.println("An athlete eats a balanced diet to fuel their performance.");
    }

    @Override
    public void exercise() {
        System.out.println("An athlete follows a rigorous training regimen to stay fit and excel in their sport.");
    }
}

class LazyPerson extends Person {
    @Override
    public void eat() {
        System.out.println("A lazy person may have unhealthy eating habits and consume junk food.");
    }

    @Override
    public void exercise() {
        System.out.println("A lazy person tends to avoid exercise and leads a sedentary lifestyle.");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        System.out.println("\nLazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
