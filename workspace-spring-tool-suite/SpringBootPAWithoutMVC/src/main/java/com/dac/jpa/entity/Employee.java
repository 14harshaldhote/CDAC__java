package com.dac.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	protected int empId;
	protected String empName;
	protected String empDeprt;
	protected double empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empDeprt, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDeprt = empDeprt;
		this.empSalary = empSalary;
	}
	public Employee(String empName, String empDeprt, double empSalary) {
		super();
		this.empName = empName;
		this.empDeprt = empDeprt;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDeprt() {
		return empDeprt;
	}
	public void setEmpDeprt(String empDeprt) {
		this.empDeprt = empDeprt;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDeprt=" + empDeprt + ", empSalary="
				+ empSalary + "]";
	}	
}