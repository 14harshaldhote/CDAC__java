package com.example.endmodule.EndModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.endmodule.EndModule.modal.Student;
import com.example.endmodule.EndModule.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/")
	public String showRecords(Model m) {
		List<Student> studs=studentService.showAllStudent();
		m.addAttribute("students", studs);
		return "displayRecord.html";
	}
	
	@RequestMapping("/new")
	public String newStudent(Model m) {
		Student s=new Student();
		m.addAttribute("student", s);
		return "newStudent.html";		
	}
	
//	@RequestMapping(path = "/insert",method = RequestMethod.POST)
//	public String addStudent(@ModelAttribute Student stud) {
//		studentService.addStudent(stud);
//		System.out.println(stud);
//		return "redirect:/";
//	}
	 @RequestMapping(path = "/insert", method = RequestMethod.POST)
	    public String addStudent(@ModelAttribute("student") Student stud) {
	        System.out.println("Received Student: " + stud);
	        studentService.addStudent(stud);
	        return "redirect:/";
	    }
	
	@RequestMapping("/edit/{sid}")
	public String getStudent(@PathVariable int sid,Model m) {
		Student stud=studentService.getStudent(sid);
		m.addAttribute("student",stud);
		return "newStudent.html";
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute Student s) {
		studentService.update(s,s.getId());
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		studentService.delete(sid);
		return "redirect:/";
	}
}