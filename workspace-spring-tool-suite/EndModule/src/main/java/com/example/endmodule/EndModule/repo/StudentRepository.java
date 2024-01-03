package com.example.endmodule.EndModule.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.endmodule.EndModule.modal.Student;



@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

//	 Optional<Student> findByEmailAndPassword(String email, String password);
	 Optional<Student> findByEmailAndPassword(String email, String password);



}
