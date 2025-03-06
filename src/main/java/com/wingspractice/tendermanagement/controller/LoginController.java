package com.wingspractice.tendermanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wingspractice.tendermanagement.dto.LoginDTO;
import com.wingspractice.tendermanagement.security.JWTUtil;
import com.wingspractice.tendermanagement.service.LoginService;

@RestController
public class LoginController {

	
	private AuthenticationProvider authenticationManager;
	
	LoginService loginService;
	
	private JWTUtil jwtTokenUtil;
	
	@PostMapping("/login")
	public ResponseEntity<Object> authenticateUser(LoginDTO authenticationRequest) throws Exception{
		return null;
	}
}