public class mains{
    int a=10;
    static int b=20;
    int c;
    void show(){
        a = 20;
        int d = 50;
        System.out.println("The value of D is : "+d);
        int e;
        
        System.out.println(c);
        // e = 60;
        // System.out.println(e);
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        mains v = new mains();
        v.show();

    }
}