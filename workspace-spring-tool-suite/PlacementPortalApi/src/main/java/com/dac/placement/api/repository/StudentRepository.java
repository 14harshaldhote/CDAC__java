package com.dac.placement.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dac.placement.api.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
