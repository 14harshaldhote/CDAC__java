

package exception;

/**
 *
 * @author harshalsMac
 */
import java.lang.Exception;
public class p1 {
     int a=10;
    int b=0;
    int[] arr = new int[3];
    void show(){
        try{
            System.out.println("C");
        
            System.out.println(a/b);
            try{
                arr[5]=12;
            }
            catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
            
  
            
         }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
        finally{
            System.out.println("D");
        
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
