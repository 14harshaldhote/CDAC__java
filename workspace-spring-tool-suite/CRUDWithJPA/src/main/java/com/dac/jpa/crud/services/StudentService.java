package com.dac.jpa.crud.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dac.jpa.crud.model.Student;

@Service
public class StudentService {
    List<Student> lst;

    public StudentService() {
        lst = new ArrayList<>();
        lst.add(new Student(101, "Ramesh", "ram@gmail.com", "Rampur", "ram"));
        lst.add(new Student(102, "Suresh", "sur@gmail.com", "Solapur", "sur"));
        lst.add(new Student(103, "Dinesh", "din@gmail.com", "Durgapur", "din"));
    }

    public List<Student> getAllStudents() {
        return lst;
    }

    public void addStudent(Student stud) {
        lst.add(stud);
    }

    public Student getStudentById(int sid) {
        Student stud = null;
        for (Student s : lst) {
            if (s.getId() == sid) {
                stud = s;
            }
        }
        return stud;
    }

    public void updateStudent(Student s, int sid) {
        for (Student st : lst) {
            if (st.getId() == sid) {
                st.setId(s.getId());
                st.setName(s.getName());
                st.setEmail(s.getEmail());
                st.setCity(s.getCity());
                st.setPassword(s.getPassword());
            }
        }
    }

    public void deleteStudent(int sid) {
        List<Student> l = new ArrayList<>();
        for (Student s : lst) {
            if (s.getId() != sid) {
                l.add(s);
            }
        }
        lst = l;
    }
}
