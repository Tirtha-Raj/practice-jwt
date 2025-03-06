package com.wingspractice.tendermanagement.service;

import org.springframework.http.ResponseEntity;

import com.wingspractice.tendermanagement.model.BiddingModel;
import com.wingspractice.tendermanagement.repository.BiddingRepository;


public class BiddingService {

	private BiddingRepository biddingRepository;

	private UserService userService;

	// to add the bidding using biddingModel object
	// created()->201
	// badRequest()->400
	public ResponseEntity<Object> postBidding(BiddingModel bidding) {
		return null;
	}

	// to get the bidding which are greater than the given bid amount
	// OK()->200
	// badRequest()->400
	public ResponseEntity<Object> getBidding(double bidAmount) {
		return null;
	}

	// to update the bidding status
	// OK()->200
	// badRequest()->400
	public ResponseEntity<Object> updateBidding(int id, BiddingModel biddingModel) {
		return null;
	}


	//to delete the bidding by using id
	//approver and only the creater of that particular bidding can delete
	// noContent()->204
	// forbidden()->403
	// badRequest()->400
	public ResponseEntity<Object> deleteBidding(int id) {
		return null;
	}

}
