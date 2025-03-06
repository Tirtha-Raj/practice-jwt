package com.wingspractice.tendermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wingspractice.tendermanagement.model.RoleModel;


public interface RoleRepository extends JpaRepository<RoleModel, Integer> {

	//add the required annotation to make the role repository
}
