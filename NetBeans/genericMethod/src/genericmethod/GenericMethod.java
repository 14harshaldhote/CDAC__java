/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmethod;

import java.util.List;

/**
 *
 * @author harshalsMac
 */


    /**
     * Actually we are need to write more code to over come some problem if i want
     * to pass both array in one method and that is known as method overloading.To overcome such problem we have generic method
     * @param arr 
     */
    
//    public static void showdata(String arr[] ){//its not neceassy to make sttaic generic method 
//        
//        for(String s: arr){
//            System.out.println(s);
//        }
//        
//    }
//    public static void showdata(Integer a[] ){
//        
//        for(Integer i: a){
//            System.out.println(i);
//        }
//        
//    }
    
public class GenericMethod {

    
//NORMAL one
//    public static <T> void showData(List<T> list) {
//        for (T element : list) {
//            System.out.println(element);
//        }
//    }
//    
    
    //Upper bound
   public static void showData(List<? extends Integer> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
    
//    //lower bound
//     public static <T> void showData(List<? super Number> list) {
//        for (Object element : list) {
//            System.out.println(element);
//        }
//    }

    public static void main(String[] args) {
//        String names[] = { "jai", "viru", "rekha", "bali", "java", "nathu" };
//        Integer ages[] = { 32, 22, 64, 87, 12, 16 };
//
//        showData(names); // Display names
//        showData(ages);  // Display ages


      //  List<String> lst1=List.of("ed","dwq","bdfbd","jhdbq");
        
        List<Integer> lst2=List.of(23,25,76,12,98,53);
        
       // showData(lst1);
        showData(lst2);
        
        List<Number> lst3=List.of(7843,3534.32,3455.42,145.32);
        
    }
}
