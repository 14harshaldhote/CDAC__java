
package abstractionproperties;

abstract class Livingthing{
    void eyes(){
        System.out.println("Two eyes");}
    void mouth(){
        System.out.println("one mouth");
    }
    abstract void legs();
    
    
    
}
class Human extends Livingthing{
    void legs(){
        System.out.println("two legs");
        
    }
}
class Animal extends Livingthing{
    void legs(){
        System.out.println("Four legs");
    }
    
}

public class AbstractionProperties {

    
    public static void main(String[] args) {
        
        System.out.println("Property Of Human");
        Livingthing li;
        li=new Human();
        li.eyes();
        li.mouth();
        li.legs();
        System.out.println("\nProperty Of Animal ");
        li=new Animal();
        li.eyes();
        li.mouth();
        li.legs();
        
        
        
    }
    
}
 