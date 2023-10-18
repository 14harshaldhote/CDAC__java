/*
 *Write a program in java to create a class name studinfo accept the student
information by the member method getdata and inherit it in the base class name marks create
method to get marks in derived class and calculate the percentage and display the complete
information of student do this for three students.
 */
package assignments.One;
import java.util.Scanner;

class studinfo{
    String name;
    int rollno;
    
    void getdata(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollno = scanner.nextInt();
    }
    
}
class marks extends studinfo{
    int marks1, marks2, marks3;

    public void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        marks1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        marks3 = scanner.nextInt();
    }
    float calculatePercentage() {
        float totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 3);
    }
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println();
    }
    
}

public class q2 {
    
    public static void main(String[] args) {
        
        marks s1=new marks();
        
        marks s2=new marks();
        
        marks s3=new marks();
        System.out.println("Enter details of S1");
        s1.getdata();
        s1.getMarks();
        
        System.out.println("Enter details of S2");
        s2.getdata();
        s2.getMarks();
        
        System.out.println("Enter details of S3");
        s3.getdata();
        s3.getMarks();
        
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
    
    
}
