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
public class q1_2 {
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat s1=new SimpleDateFormat("hh:mm:ss");
        
        String strDat1e=s1.format(d);
        System.out.println(strDat1e);
        
    }
    
}
    

