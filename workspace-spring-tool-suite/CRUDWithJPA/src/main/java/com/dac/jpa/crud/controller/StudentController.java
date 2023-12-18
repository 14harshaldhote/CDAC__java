package com.dac.jpa.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dac.jpa.crud.model.Student;
import com.dac.jpa.crud.services.StudentService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService  studentService;

    @RequestMapping("/")
    public String showRecords(Model m) {
        List<Student> studs = studentService.getAllStudents();
        m.addAttribute("students", studs);
        return "displayRecord";
    }

    @GetMapping("/new")
    public String newStudent(Model m) {
        m.addAttribute("student", new Student());
        return "newStudent";
    }

    @PostMapping("/insert")
    public String addStudent(@ModelAttribute Student stud) {
        studentService.addStudent(stud);
        return "redirect:/";
    }

    @GetMapping("/edit/{sid}")
    public String getStudent(@PathVariable int sid, Model m) {
        Student stud = studentService.getStudentById(sid);
        m.addAttribute("student", stud);
        return "newStudent";
    }

//    @PostMapping("/update")
//    public String updateStudent(@ModelAttribute Student s, @RequestParam int sid) {
//        studentService.updateStudent(s, sid);
//        return "redirect:/";
//    }
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student s, @RequestParam int sid) {
        studentService.updateStudent(s, sid);
        return "redirect:/";
    }


    @GetMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid) {
        studentService.deleteStudent(sid);
        return "redirect:/";
    }
}
