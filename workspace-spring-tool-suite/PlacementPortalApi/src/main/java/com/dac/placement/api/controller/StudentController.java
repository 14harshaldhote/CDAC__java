package com.dac.placement.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dac.placement.api.entity.Student;
import com.dac.placement.api.services.StudentService1;

@RestController
public class StudentController {
	
	@Autowired
	StudentService1 studentService1;
//	@RequestMapping(path = "/",method = RequestMethod.GET)
//	@GetMapping("/")
//	public String test() {
//		return "Just Test";
//	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents(){
		List<Student> lst=studentService1.showAllStudent();
	
		if(lst.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		}
		else {
			return ResponseEntity.status(HttpStatus.FOUND).body(lst);
		}
		
		
	}
	
	@GetMapping("/student/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable int sid){
		try {
			Student stud = null;
			stud = studentService1.getStudent(sid);
			if(stud != null) {
				return ResponseEntity.status(HttpStatus.OK).body(stud);
			}
			else {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PostMapping("/students")
	public ResponseEntity<Void>  addStudent(@RequestBody Student stud) {
		try {
		studentService1.addStudent(stud);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/student/{sid}")
	public ResponseEntity<Void> updateStudent(@RequestBody Student stud, @PathVariable int sid) {
	    try {
	        studentService1.update(stud, sid);
	        return ResponseEntity.status(HttpStatus.OK).build();
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}

	@DeleteMapping("/student/{sid}")
	public ResponseEntity<Void> deleteStudent(@PathVariable int sid) {
	    try {
	        studentService1.delete(sid);
	        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}

}
