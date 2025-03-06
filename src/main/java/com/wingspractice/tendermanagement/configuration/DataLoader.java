package com.wingspractice.tendermanagement.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.wingspractice.tendermanagement.model.RoleModel;
import com.wingspractice.tendermanagement.model.UserModel;
import com.wingspractice.tendermanagement.repository.RoleRepository;
import com.wingspractice.tendermanagement.repository.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	public void run(ApplicationArguments args) throws Exception {
		
		roleRepository.save(new RoleModel(2,"APPROVER"));
		roleRepository.save(new RoleModel(1,"BIDDER"));
		
		userRepository.save(new UserModel(1,"bidder1","compamyOne","soham123$","bd1@gmail.com", new RoleModel(1)));
		userRepository.save(new UserModel(2,"bidder2","compamyTwo","soham123$","bd2@gmail.com", new RoleModel(1)));
		userRepository.save(new UserModel(3,"approver","defaultCompany","soham123$","ap1@gmail.com", new RoleModel(2)));
	}

}
