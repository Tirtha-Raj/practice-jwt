package com.wingspractice.tendermanagement.service;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wingspractice.tendermanagement.model.UserModel;

public class LoginService implements UserDetailsService{

	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}
	
	private UserDetails buildUserForAuthentication(UserModel user, List<GrantedAuthority> authorities) {
		return null;
	}

	private List<GrantedAuthority> buildUserAuthority(String userRole){
		return null;
	}
}
