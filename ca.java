public class ca{
    int a=10;
    static int b=20;
    
    void show(){
		int c;
		c=a+b;
		System.out.println("The value of is : "+c);
        
        int d = 50;
        System.out.println("The value of D is : "+d);
      
    }
    public static void main(String[] args) {
        ca c=new ca();
		c.show();
    }
}