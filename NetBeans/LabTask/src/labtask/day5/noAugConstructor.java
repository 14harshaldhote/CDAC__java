
package labtask.day5;


//.Write a program in java which shows no argument constructor

class person{
    private String name;
    private int age;
    
    public person(){
        name="harshal";
        age=23;
        
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class noAugConstructor {
    public static void main(String ar[]){
        person p=new person();
        p.display();
    }
    
}
