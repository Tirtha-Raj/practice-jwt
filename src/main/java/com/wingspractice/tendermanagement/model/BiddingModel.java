package com.wingspractice.tendermanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BiddingModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private int biddingId;
	private final String projectName = "Metro Phase V 2024";
	private Double bidAmount;
	private Double yearsToComplete;
	private String dateOfBidding;
	private String status = "pending";
	private int bidderId;

	public BiddingModel() {
		super();
	}

	public BiddingModel(int biddingId, Double bidAmount, Double yearsToComplete) {
		this.biddingId = biddingId;
		this.bidAmount = bidAmount;
		this.yearsToComplete = yearsToComplete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBiddingId() {
		return biddingId;
	}

	public void setBiddingId(int biddingId) {
		this.biddingId = biddingId;
	}

	public Double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Double getYearsToComplete() {
		return yearsToComplete;
	}

	public void setYearsToComplete(Double yearsToComplete) {
		this.yearsToComplete = yearsToComplete;
	}

	public String getDateOfBidding() {
		return dateOfBidding;
	}

	public void setDateOfBidding(String dateOfBidding) {
		this.dateOfBidding = dateOfBidding;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBidderId() {
		return bidderId;
	}

	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}

	public String getProjectName() {
		return projectName;
	}

	@Override
	public String toString() {
		return "BiddingModel [id=" + id + ", biddingId=" + biddingId + ", projectName=" + projectName + ", bidAmount="
				+ bidAmount + ", yearsToComplete=" + yearsToComplete + ", dateOfBidding=" + dateOfBidding + ", status="
				+ status + ", bidderId=" + bidderId + "]";
	}

}
