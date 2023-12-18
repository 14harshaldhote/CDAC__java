package com.dac.jpa.crud.repo;

import com.dac.jpa.crud.model.Student;

import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Integer> {
    // You can add custom queries or methods if needed
}