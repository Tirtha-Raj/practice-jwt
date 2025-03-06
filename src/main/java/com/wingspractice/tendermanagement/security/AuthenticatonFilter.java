package com.wingspractice.tendermanagement.security;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import com.wingspractice.tendermanagement.service.LoginService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AuthenticatonFilter extends OncePerRequestFilter {
	
	private JWTUtil jwtUtil;
	
	private LoginService loginService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		//filter the incoming request and verify the request meets the security criteria
	}

}

