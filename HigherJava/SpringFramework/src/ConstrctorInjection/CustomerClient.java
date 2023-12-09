/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstrctorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author harshalsMac
 */
public class CustomerClient {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ConstrctorInjection/spring.xml");
        Customer c= ctx.getBean("cust",Customer.class);
        
        System.out.println(c);
    }
    
}

