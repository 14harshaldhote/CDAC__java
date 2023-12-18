package com.dac.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionService {
    @Pointcut("execution(public void com.dac.aop.dao.EmployeeDao.saveEmployee())")
    public void pcSaveEmployee() {
    }

    @Pointcut("execution(public void com.dac.aop.dao.*.*())")
    public void pc1() {
    }

    @Pointcut("@annotation(com.dac.aop.annotation.MyTx)")
    public void pc3() {
    }

    @Before("pc3()")
    public void myTxMethod() {
        System.out.println("Custom transaction method with pc3 pointcut");
    }

    @AfterReturning("pc1() && !pcSaveEmployee()")
    public void stopTx() {
        System.out.println("Transaction committed");
    }

    @AfterThrowing(pointcut = "pc1() && !pcSaveEmployee()", throwing = "ex")
    public void handleException(Exception ex) {
        System.out.println("Transaction rolled back due to exception: " + ex.getMessage());
    }

    @Before("pcSaveEmployee()")
    public void beginTx() {
        System.out.println("Transaction started");
    }

    @After("pcSaveEmployee()")
    public void reportGen() {
        System.out.println("Report generated");
    }
}

//package com.dac.aop.aspect;
//
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class TransactionService {
////	@Pointcut("execution(public void com.dac.aop.dao.EmployeeDao.saveEmployee())")
//	@Pointcut("execution(public void  com.dac.aop.dao.*.*())")
//	public void pc1() {
//	}
//	
//	@Pointcut("@annotation(com.dac.aop.annotation.MyTx)")
//	public void pc3() {
//	}
//	 @Before("pc3()")
//	    public void myTxMethod() {
//	        System.out.println("Custom transaction method with pc3 pointcut");
//	    }
//
//	 @AfterReturning("pc1()")
//	    public void stopTx() {
//	        System.out.println("Transaction committed");
//	    }
//	 
//
//	    @AfterThrowing(pointcut = "pc1()", throwing = "ex")
//	    public void handleException(Exception ex) {
//	        System.out.println("Transaction rolled back due to exception: " + ex.getMessage());
//	    }
//	    
//	@Before("pc1()")
//	public void beginTx() {
//		System.out.println("Transaction started");
//	}
////	@After("pc1()")
////	public void stopTx() {
////		System.out.println("Transaction stoped");
////	}
//	
//	@After("pc1()")
//	public void reportGen() {
//		System.out.println("Report generated");
//	}
////	
////	@AfterReturning("pc1()")
////	public void stopTx() {
////		System.out.println("Transaction stoped");
////	}
//	
//	
//	
////	public void StartTx() {
////		System.out.println("Transaction stoped");
////	}
////	
//	
//}
