
package lamdaexp;

//class test{
//    void message(){
//    System.out.println("PACKAGE RECIVED");
//    
//}
//}
interface Message {
    void showMessage();
}

public class LamdaExp {

   
    public static void main(String[] args) {
        
         Message message = () -> System.out.println("PACKAGE RECEIVED");
         message.showMessage();
        
    }
    
}
