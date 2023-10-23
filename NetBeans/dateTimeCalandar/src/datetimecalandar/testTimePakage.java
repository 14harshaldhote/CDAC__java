/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimecalandar;

/**
 *
 * @author harshalsMac
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;
public class testTimePakage {
    public static void main(String[] args) {
        System.out.println("Enter your date in format of date/month/year : ");
        Scanner sc=new Scanner(System.in);
        
        String dob=sc.next();
        String [] arr=dob.split("/");
        int dt=Integer.parseInt(arr[0]);
        int mon=Integer.parseInt(arr[1]);
        int yr=Integer.parseInt(arr[2]);
        
        LocalDate dateOfBirth = LocalDate.of(yr, mon, dt);
        
        LocalDate today=LocalDate.now();
        
        Period p=Period.between(dateOfBirth, today);
        
        System.out.println(p.getYears()+" Olds " +p.getMonths()+" Months "+ p.getDays()+" Days Old");
        
        
        LocalDateTime timeS=LocalDateTime.now();
        System.out.println(timeS);
        
        LocalDateTime timeS1=LocalDateTime.now();
        System.out.println(today.getDayOfMonth());
        System.out.println(today.atStartOfDay());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        
                
        
        
    }
    
    
    
}
