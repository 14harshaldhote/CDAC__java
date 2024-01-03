//package com.example.endmodule.EndModule.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.endmodule.EndModule.modal.Student;
//import com.example.endmodule.EndModule.repo.StudentRepository;
//
//
//@Service
//public class StudentService {
//	
//	@Autowired
//    StudentRepository studentrepository;
//	public List<Student> showAllStudent(){
//		List<Student> lst=(List<Student>)studentrepository.findAll();
//		return lst;
//	}
//
//	public void addStudent(Student stud) {
//		studentrepository.save(stud);
//	}
//
//	public Student getStudent(int sid) {
//		Student stud=studentrepository.findById(sid).get();
//		return stud;
//	}
//
//	public void update(Student s,int sid) {
//		Student oldStud=studentrepository.findById(sid).get();
//		oldStud=s;
//		studentrepository.save(oldStud);
//	}
//
//	public void delete(int sid) {
//		studentrepository.deleteById(sid);
//	}
//}
package com.example.endmodule.EndModule.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.endmodule.EndModule.modal.Student;
import com.example.endmodule.EndModule.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
    StudentRepository studentRepository;

	public List<Student> showAllStudent(){
		List<Student> lst = (List<Student>) studentRepository.findAll();
		return lst;
	}

	public void addStudent(Student stud) {
		studentRepository.save(stud);
	}

	public Student getStudent(int sid) {
		Student stud = studentRepository.findById(sid).orElse(null);
		return stud;
	}

	public void update(Student s, int sid) {
		Student oldStud = studentRepository.findById(sid).orElse(null);
		if (oldStud != null) {
			oldStud.setName(s.getName());
			oldStud.setEmail(s.getEmail());
			oldStud.setCity(s.getCity());
			oldStud.setPassword(s.getPassword());
			studentRepository.save(oldStud);
		}
	}

	public void delete(int sid) {
		studentRepository.deleteById(sid);
	}

//	public Optional<Student> authenticate(String email, String password) {
//        return studentRepository.findByEmailAndPassword(email, password);
//    }
	public Optional<Student> authenticate(String email, String password) {
	    return studentRepository.findByEmailAndPassword(email, password);
	}

}
