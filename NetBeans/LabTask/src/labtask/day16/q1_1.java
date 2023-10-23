package labtask.day16;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harshalsMac
 */
public class q1_1 {
    
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat d1=new SimpleDateFormat("dd-MM-yyyy");
        String s1=d1.format(d);
        System.out.println(s1);
        
    }
    
}
