/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day16;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author harshalsMac
 */
public class q2_1 {
    public static void main(String[] args) {
        String date="2023-10-23";
        SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d2=s2.parse(date);
            System.err.println(d2);
            
        }
        catch(Exception e){}
       
        
    }
    
}
