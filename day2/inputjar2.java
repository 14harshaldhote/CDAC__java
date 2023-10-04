import java.util.Scanner;
public class inputjar2{
	int arr[][] = new int[3][];
	
  
           
       
	
	void takeInput(){
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[4];
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter "+ (arr[0].length + arr[1].length + arr[2].length)+" numbers : ");
		for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                arr[i][j] = cs.nextInt();
		            }
		}
	}
	void showOutput(){
		
		System.out.println("MATRIX");
		for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }
	}
	public static void main(String a[]){
		inputjar2 nj2= new inputjar2();
		
		nj2.takeInput();
		nj2.showOutput();
	
	}
	
}