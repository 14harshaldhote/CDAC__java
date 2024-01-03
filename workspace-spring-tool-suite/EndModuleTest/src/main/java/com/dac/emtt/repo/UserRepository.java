package com.dac.emtt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dac.emtt.modal.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmailAndPassword(String email, String password);

	User findByUsername(String username);
}
