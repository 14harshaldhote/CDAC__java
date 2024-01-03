package com.dac.emtt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dac.emtt.modal.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	Admin findByUsername(String username);

}
