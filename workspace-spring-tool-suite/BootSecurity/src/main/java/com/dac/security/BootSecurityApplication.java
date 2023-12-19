package com.dac.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dac.security.model.User;
import com.dac.security.repository.UserRepository;

@SpringBootApplication
public class BootSecurityApplication implements CommandLineRunner {
    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    UserRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(BootSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (repo.findByUsername("sha") == null) {
            User u1 = new User("sha", encoder.encode("sha"), "sha@gmail.com", "ROLE_ADMIN");
            repo.save(u1);
        }

        if (repo.findByUsername("mnha") == null) {
            User u2 = new User("mnha", encoder.encode("ha"), "ha@gmail.com", "ROLE_NORMAL");
            repo.save(u2);
        }
    }

}
