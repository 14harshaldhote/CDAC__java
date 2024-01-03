package com.dac.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dac.security.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String userName);

	Object findByEmailAndPassword(String email, String password);
}
