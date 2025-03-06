package com.wingspractice.tendermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wingspractice.tendermanagement.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Integer>{
	
	//add the required annotation to make the user repository
}
