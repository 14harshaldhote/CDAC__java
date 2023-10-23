/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimecalandar;

/**
 *
 * @author harshalsMac
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class testmanipulation {
    public static void main(String[] args) {
        Date d= new Date();
     
        System.out.println(d);
        
        SimpleDateFormat s=new SimpleDateFormat("MM-yyyy-dd");
        
        String strDate=s.format(d);
        System.out.println(strDate);
        
        SimpleDateFormat s1=new SimpleDateFormat("MM-yyyy-dd hh:mm:ss");
        
        String strDat1e=s1.format(d);
        System.out.println(strDat1e);
        
        
        //String to date conversion
        String date="2023-10-23";
        SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d2=s2.parse(date);
            System.err.println(d2);
            
        }
        catch(Exception e){}
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        System.err.println(sdf.format(new Date()));
        
    }
    
}
