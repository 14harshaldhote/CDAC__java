package com.dac.placement.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dac.placement.api.entity.Student;

@Service
public class StudentService {
	List<Student> lst;

	public StudentService() {
		lst=new ArrayList<>();
		lst.add(new Student(101, "Ramesh", "ram@gmail.com", "Rampur", "ram"));
		lst.add(new Student(102, "Suresh", "sur@gmail.com", "Solapur", "sur"));
		lst.add(new Student(103, "Dinesh", "din@gmail.com", "Durgapur", "din"));
	}
	
	public List<Student> showAllStudent(){
		return lst;
	}

	public void addStudent(Student stud) {
		lst.add(stud);
	}

	public Student getStudent(int sid) {
		Student stud=lst.stream().filter(e->e.getId()==sid).findFirst().get();
		return stud;
	}

	public void update(Student s,int sid) {
		lst=lst.stream().map(st->{
			if(st.getId()==sid) {
				st=s;
			}
			return st;
		}).collect(Collectors.toList());
	}

	public void delete(int sid) {
		lst=lst.stream().filter(s->s.getId()!=sid).collect(Collectors.toList());
	}
}
