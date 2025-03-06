package com.wingspractice.tendermanagement.security;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class JWTUtil implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2196744202294264312L;

	public static final long JWT_TOKEN_VALIDITY = 500*60*60;
	
	private final String secretKey="randomkey123";
	

	
}

