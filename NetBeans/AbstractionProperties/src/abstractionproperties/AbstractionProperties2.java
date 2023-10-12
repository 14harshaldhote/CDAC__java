
package abstractionproperties;



import java.util.*;

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


public class AbstractionProperties2 {
    
    static void showProperty(Livingthing l){
        l.eyes();
        l.mouth();
        l.legs();
    
}
    public static void main(String[] args) {
        
        
        System.out.println("Whose property want to know");
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        if(choice.equals("Human")){
            System.out.println("Property of Humans...");
            showProperty(new Human());
        }
        else{
            System.out.println("Property of Animals...");
            showProperty(new Animal());
        }
        
        
        
        
    }
    
    
    
}
