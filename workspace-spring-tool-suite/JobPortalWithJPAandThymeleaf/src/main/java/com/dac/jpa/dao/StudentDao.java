package com.dac.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.jpa.entity.Student;
import com.dac.jpa.repository.StudentRepository;

@Service
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepository;
	
	

	public StudentDao(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> showAllStudent() {
		List<Student> all = (List<Student>) studentRepository.findAll();
		return all;
	}

	public void addStudent(Student stud) {
		studentRepository.save(stud);
		
	}

	public Student showStudent(int sid) {
		Student stud=studentRepository.findById(sid).get();
		return stud;
	}

	public void update(Student s, int id) {
		Student stud=studentRepository.findById(id).get();
		stud.setName(s.getName());
		stud.setEmail(s.getEmail());
		stud.setCity(s.getCity());
		stud.setPassword(s.getPassword());
		studentRepository.save(stud);
	}

	public void delete(int sid) {
		studentRepository.deleteById(sid);
	}
}
