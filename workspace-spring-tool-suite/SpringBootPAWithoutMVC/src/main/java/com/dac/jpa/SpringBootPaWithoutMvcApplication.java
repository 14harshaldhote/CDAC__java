package com.dac.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dac.jpa.entity.Employee;
import com.dac.jpa.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootPaWithoutMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootPaWithoutMvcApplication.class, args);
		EmployeeRepository  repository= ctx.getBean(EmployeeRepository.class);
		
//		Employee  emp=new Employee("raju","admin",75999);
//		Employee  emp1=new Employee("renu","developer",30999);
//		Employee  emp2=new Employee("minti","accounts",20399);
//		Employee  emp3=new Employee("suraj","developer",55959);
//		Employee  emp4=new Employee("prafulkumar","accounts",45999);
//		
//		List <Employee> lst=List.of(emp,emp1,emp2,emp3,emp4);
//		Iterable<Employee> lst1=repository.saveAll(lst);
//		System.out.println(lst1);
		
		
//		Optional<Employee> emp=repository.findById(105);
//		System.out.print(emp);
		
		
		//fetech all
//		Iterable<Employee> allList=repository.findAll();
//		for(Employee e:allList) {
//			System.out.println(e);
//		}
		
		
		//delete
//		repository.deleteById(105);;
		
		
		//update
//		Employee emp=repository.findById(104).get();
//		emp.setEmpName("Mintii");
//		Employee e=repository.save(emp);
		
//		Employee emp=repository.findById(104).get();
//		emp.setEmpSalary(50239);
//		Employee e=repository.save(emp);
		
		
//		List<Employee> emp=repository.findByEmpName("renu");
//		emp.forEach(e-> System.out.println(e));
		
//		List<Employee> emp=repository.findByEmpSalaryGreaterThan(30000);
//		emp.forEach(e-> System.out.println(e));
		List<Employee> emp=repository.findByEmpNameOrEmpDeprt("renu","developer");
		emp.forEach(e-> System.out.println(e));
	}

}
