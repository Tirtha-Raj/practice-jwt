package com.wingspractice.tendermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wingspractice.tendermanagement.model.BiddingModel;


public interface BiddingRepository extends JpaRepository<BiddingModel, Integer>{
	
	//add the required annotation to make the bidding repository
}
