package com.wingspractice.tendermanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wingspractice.tendermanagement.model.BiddingModel;
import com.wingspractice.tendermanagement.service.BiddingService;


@RequestMapping("/bidding")
public class BiddingController {
	
	
	private BiddingService biddingService;
	
	//to create a bidding using biddingModel object
	@PostMapping("/add")
	public ResponseEntity<Object> postBidding( BiddingModel bidding){
		return null;
	}
	
	//to get the bidding which are greater than the given bid amount
	@GetMapping("/list")
	public ResponseEntity<Object> getBidding( double bidAmount){
		return null;
	}
	
	@GetMapping("/listAll")
	public ResponseEntity<Object> getBidding(){
		return null;
	}
	
	//to update the bidding by id as Pathvariable and bidding object
	@PatchMapping("/update/{id}")
	public ResponseEntity<Object> updateBidding(int id, BiddingModel biddingModel){
		return null;
	}
	
	//to delete the bidding by using id as Pathvariable
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteMapping(int id){
		return null;
	}
	
    private String getCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (String) authentication.getPrincipal();
    }
	
}
