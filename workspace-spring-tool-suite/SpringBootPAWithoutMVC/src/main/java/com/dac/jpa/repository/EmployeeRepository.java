package com.dac.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dac.jpa.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
//	
	public List<Employee> findByEmpName(String empName);
//	
	public List<Employee> findByEmpSalaryGreaterThan(double empSalary);
//	
//	public List<Employee> findByEmpNameAndEmpDeprt(String empName,String empDeprt);
	public List<Employee> findByEmpNameOrEmpDeprt(String empName,String empDeprt);
//	
////	public List<Employee> findTop3ByEmpSalary();
//	
//	//JPQL
////	@Query("Select e from Employee e")
////	public List<Employee> findAllEmployee();
//	
//	//Native Query
//	@Query(value = "Select * from Employee",nativeQuery = true)
//	public List<Employee> findAllEmployee();
//	
//	//JPQL
//	@Modifying(clearAutomatically = true,flushAutomatically = true)
//	@Transactional
//	@Query("update Employee set empSalary=?1 where empId=?2")
//	public void updateEmpSalaryByEmpId(double empSalary,int empId );
	
}