
package innerclass.Annonymous;

/*interface ParentOfAnnonymous{
       public  void greeting();
    
}

class outerOfAnyn{
    
    ParentOfAnnonymous p=new ParentOfAnnonymous(){
        @Override
        void greeting() {
            System.out.println(" Congrats you had become a father"); 
        }
    };
 */
class ParentOfAnnonymous{
        void greeting(){
            
            System.out.println(" Congrats you had become a father");
        }
    
}

class outerOfAnyn{
    
    ParentOfAnnonymous p=new ParentOfAnnonymous(){
        @Override
        void greeting() {
            super.greeting(); 
        }
    };
    
    
}

public class testInnerAnnonymous {
    
    public static void main(String ar[]){
        outerOfAnyn o=new outerOfAnyn();
        
        o.p.greeting();
        
        
    }
    
}
