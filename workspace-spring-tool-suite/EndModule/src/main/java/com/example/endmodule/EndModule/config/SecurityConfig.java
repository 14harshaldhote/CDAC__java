//import com.example.endmodule.EndModule.service.StudentService;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import com.example.endmodule.EndModule.modal.Student;
//
//@Configuration
//public class SecurityConfig {
//
//    @Autowired
//    private StudentService studentService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return email -> {
//            if ("Mukul".equals(email)) {
//                // Admin user
//                return User.withUsername("Mukul")
//                        .password(passwordEncoder().encode("pass"))
//                        .roles("ADMIN")
//                        .build();
//            } else {
//                // Normal user
//                Optional<Student> studentOptional = studentService.authenticate(email, "");
//                return studentOptional.map(student -> User
//                        .withUsername(student.getEmail())
//                        .password(passwordEncoder().encode(student.getPassword()))
//                        .roles("USER")
//                        .build())
//                        .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
//            }
//        };
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf(csrf -> csrf.disable())
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/", "/insert", "/edit/**", "/update", "/delete/**").hasRole("ADMIN")
//                                .requestMatchers("/user/**").hasRole("USER")
//                                .anyRequest().authenticated())
//                .formLogin(withDefaults());
//
//        return http.build();
//    }
//
//	private Customizer<FormLoginConfigurer<HttpSecurity>> withDefaults() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
package com.example.endmodule.EndModule.config;


import com.example.endmodule.EndModule.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Autowired
    private StudentService studentService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return email -> {
            if ("Mukul".equals(email)) {
                // Admin user
                return User.withUsername("Mukul")
                        .password(passwordEncoder().encode("pass"))
                        .roles("ADMIN")
                        .build();
            } else {
                // Normal user
                UserDetails userDetails = studentService.authenticate(email, "")
                        .map(student -> User
                                .withUsername(student.getEmail())
                                .password(passwordEncoder().encode(student.getPassword()))
                                .roles("USER")
                                .build())
                        .orElseThrow(() -> new RuntimeException("User not found with email: " + email));

                return userDetails;
            }
        };
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/", "/insert", "/edit/**", "/update", "/delete/**").hasRole("ADMIN")
                                .requestMatchers("/user/**").hasRole("USER")
                                .anyRequest().authenticated())
                .formLogin();

        return http.build();
    }
}
