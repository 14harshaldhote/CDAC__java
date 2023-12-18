package com.dac.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	public void saveEmployee() {
		System.out.println("save employee");
		if(new Random().nextInt(15)<=10) {
			throw new RuntimeException("Dummy excrption........................***********************--------------------");
		}
//		return "Soft Polynomial";
	}

	
	public void deleteEmployee() {
		System.out.println("Employe deleted sucessuflyy");
	}
}
