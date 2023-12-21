package com.dac.reactSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dac.reactSpring.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
