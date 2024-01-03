package com.dac.emtt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dac.emtt.service.YourUserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CustomAccessDecisionManager customAccessDecisionManager() {
        return new CustomAccessDecisionManager();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // Create a default admin user during initialization
        UserDetails adminUser = User.builder()
                .username("mukul")
                .password(passwordEncoder().encode("pass1"))
                .roles("ADMIN")
                .build();

        return new YourUserDetailsServiceImpl();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .requestMatchers("/home/admin/**").hasRole("ADMIN")
            .requestMatchers("/home/user/**").hasRole("USER")
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .exceptionHandling().accessDeniedPage("/access-denied")
            .and()
            .csrf().disable();
    }
}
