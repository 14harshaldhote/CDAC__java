
package inherit.Overriding;

/**
 *
 * Object Depending Methods
 */

class Animal{
    
    void animalSound(){
        
        System.out.println("Generic animal sound ");
    }
};
class Dog extends Animal{
    @Override
    void animalSound(){
        System.out.println("Dog Bark : Bhauu Bhauuuuuuu........");
    }
}

class Cat extends Animal{
    @Override
    void animalSound(){
        System.out.println("Cat meawoooooo.....");
    }
}
public class methodOverridding {
    public static void main(String [] arr){
        Dog d=new Dog();
        Cat c= new Cat();
        
        
        d.animalSound();
        c.animalSound();
        
        
        Animal e;
        e=new Animal();
        e.animalSound();
        
        Animal f;
        f=new Dog();
        f.animalSound();
        
        Animal g;
        g=new Cat();
        g.animalSound();
        
    }
    
}
