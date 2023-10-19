

package exception;

/**
 *
 * @author harshalsMac
 */
import java.lang.Exception;
public class p1 {
     int a=10;
    int b=0;
    void show(){
        try{
            System.out.println("C");
        
        System.out.println(a/b);
        
        System.out.println("D");
            
        }
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("A");
        p1 e=new p1();
        System.out.println("B");
        e.show();
        System.out.println("E");
        
        
        
       
    }
    
}
