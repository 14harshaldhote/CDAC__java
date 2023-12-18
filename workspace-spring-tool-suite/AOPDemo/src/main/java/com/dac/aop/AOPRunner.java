package com.dac.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dac.aop.dao.EmployeeDao;
import com.dac.aop.dao.StudentDao;

@Component
public class AOPRunner implements CommandLineRunner {

    @Autowired
     EmployeeDao employeeDao;
    @Autowired
     StudentDao studentDao;

    @Override
    public void run(String... args) throws Exception {
        // Your AOP-related code here
        // For example, you can call a method on the EmployeeDao that triggers the AOP aspect
    	 System.out.println("**************************");
    	studentDao.saveStudent();
    	 System.out.println("***************************8****************");
    	 
    	studentDao.deleteStudent();
    	 System.out.println("**************************");
        employeeDao.saveEmployee();
        System.out.println("**************************");
        employeeDao.deleteEmployee();
        
        
    }
}
