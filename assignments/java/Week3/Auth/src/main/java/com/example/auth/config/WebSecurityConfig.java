package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception{	
		http
		    .authorizeHttpRequests()
	            	.antMatchers("/", "/home").authenticated()
	                .anyRequest().permitAll()
	                .and()
	            .formLogin()
	                .permitAll()
	                .loginPage("/login")
	                .defaultSuccessUrl("/home")
	                .and()
	            .logout()
	                .permitAll();
		
		return http.build();
	}

}
