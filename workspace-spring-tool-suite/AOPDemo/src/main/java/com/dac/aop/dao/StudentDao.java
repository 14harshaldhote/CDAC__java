package com.dac.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.dac.aop.annotation.MyTx;



@Component
public class StudentDao {
	
	public void saveStudent() {
		System.out.println("save Studentsss.......");
//		return "std";
//		return "Soft Polynomial";
	}
	@MyTx
	public void deleteStudent() {
		System.out.println("user deletd...");
	}

}
