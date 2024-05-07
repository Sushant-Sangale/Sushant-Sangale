package com.example.main.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.main.model.User;
import com.example.main.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
 User save(UserRegistrationDto registrationDto);
	 
 
}
