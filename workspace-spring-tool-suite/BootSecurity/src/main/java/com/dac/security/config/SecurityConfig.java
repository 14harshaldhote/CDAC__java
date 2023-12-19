package com.dac.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.dac.security.services.CustomUserDetailsService;



@Configuration
public class SecurityConfig {
	
	@Bean
	public  BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		// In InMemoryDatabase
//		UserDetails normalUser = User
//				.withUsername("sha")
//				.password(passwordEncoder().encode("sha"))
//				.roles("NORMAL")
//				.build();
//
//		UserDetails adminUser = User
//				.withUsername("har")
//				.password(passwordEncoder().encode("har"))
//				.roles("ADMIN")
//				.build();
//
//		return new InMemoryUserDetailsManager(normalUser, adminUser);
		return new CustomUserDetailsService();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.authorizeRequests()
				.requestMatchers("/home/admin","/users/**").hasRole("ADMIN")
				
				.requestMatchers("/home/normal").hasRole("NORMAL")
				
				.requestMatchers("/home/publics").permitAll()
				
				.anyRequest().authenticated()
				.and()
				.formLogin(); 
				//.httpBasic(); // basic authentication
		     // for form-based authentication

		return http.build();
	}
}
