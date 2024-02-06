package com.hexaware.entity;

public class Claim {
	private int claimId;
	private String claimNumber;
	private String dateFiled;
	private double claimAmount;
	private String status;
	private Policy policy;
	private Client client;

	public Claim() {
		// TODO Auto-generated constructor stub
	}

	public Claim(int claimId, String claimNumber, String dateFiled, double claimAmount, String status, Policy policy,
			Client client) {
		this.claimId = claimId;
		this.claimNumber = claimNumber;
		this.dateFiled = dateFiled;
		this.claimAmount = claimAmount;
		this.status = status;
		this.policy = policy;
		this.client = client;
	}

// Getter methods
	public int getClaimId() {
		return claimId;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public String getDateFiled() {
		return dateFiled;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public String getStatus() {
		return status;
	}

	public Policy getPolicy() {
		return policy;
	}

	public Client getClient() {
		return client;
	}

// Setter methods
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public void setDateFiled(String dateFiled) {
		this.dateFiled = dateFiled;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public void setClient(Client client) {
		this.client = client;
	}

// toString method
	@Override
	public String toString() {
		return "Claim{" + "claimId=" + claimId + ", claimNumber='" + claimNumber + '\'' + ", dateFiled='" + dateFiled
				+ '\'' + ", claimAmount=" + claimAmount + ", status='" + status + '\'' + ", policy=" + policy
				+ ", client=" + client + '}';
	}

	public void printClaimDetails() {
		System.out.println("Claim Details:");
		System.out.println("ClaimID: " + claimId);
		System.out.println("ClaimNumber: " + claimNumber);
		System.out.println("DateFiled: " + dateFiled);
		System.out.println("ClaimAmount: " + claimAmount);
		System.out.println("Status: " + status);
		System.out.println("Policy: " + policy);
		System.out.println("Client: " + client);
	}
}
