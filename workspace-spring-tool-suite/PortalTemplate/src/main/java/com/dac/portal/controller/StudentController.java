package com.dac.portal.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.dac.portal.model.*;

@Controller
public class StudentController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String showRecords(Model m) {
		ResponseEntity<Student[]> resEntity = restTemplate.getForEntity("http://localhost:8080/students",Student[].class);
		
		List<Student> studs=Arrays.asList(resEntity.getBody());
		m.addAttribute("students", studs);
		return "displayRecord";
	}
	
	@RequestMapping("/new")
	public String newStudent(Model m) {
		Student s=new Student();
		m.addAttribute("student", s);
		return "newStudent";		
	}
	
//	@RequestMapping(path = "/insert",method = RequestMethod.POST)
//	public String addStudent(@ModelAttribute Student stud) {
//		restTemplate.postForEntity("http://localhost:8008/students", stud, Student.class);
//		return "redirect:/";
//	}
	@RequestMapping(path = "/insert", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute Student stud) {
	    try {
	        restTemplate.postForEntity("http://localhost:8080/students", stud, Student.class);
	    } catch (ResourceAccessException e) {
	        throw new RuntimeException("Unable to connect to the API server. Please check server availability.");
	    }
	    return "redirect:/";
	}

	
	@RequestMapping("/edit/{sid}")
	public String getStudent(@PathVariable int sid,Model m) {
		ResponseEntity<Student> resEntity = restTemplate.getForEntity("http://localhost:8080/student/"+sid, Student.class);
		Student stud=resEntity.getBody();
		m.addAttribute("student",stud);
		return "newStudent";
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute Student s) {
		restTemplate.put("http://localhost:8080/student/"+s.getId(),s,Student.class);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		restTemplate.delete("http://localhost:8080/student/"+sid,Student.class);
		return "redirect:/";
	}
}
