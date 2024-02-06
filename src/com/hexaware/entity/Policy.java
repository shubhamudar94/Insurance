package com.hexaware.entity;

public class Policy {
	private int policyId;
	private String policyName;

	public Policy() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public Policy(int policyId, String policyName) {
		this.policyId = policyId;
		this.policyName = policyName;
	}

	// Getter methods
	public int getPolicyId() {
		return policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	// Setter methods
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	// toString method
	@Override
	public String toString() {
		return "Policy{" + "policyId=" + policyId + ", policyName='" + policyName + '\'' + '}';
	}

	public void printPolicyDetails() {
		System.out.println("Policy Details:");
		System.out.println("PolicyID: " + policyId);
		System.out.println("PolicyName: " + policyName);
	}
}
