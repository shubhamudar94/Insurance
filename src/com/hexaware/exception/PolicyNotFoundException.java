package com.hexaware.exception;

public class PolicyNotFoundException extends Exception {

	public PolicyNotFoundException(String policyId) {
		// TODO Auto-generated constructor stub
		System.out.println("PolicyNotFoundException : Please Enter Valid Policy Number");
	}

	@Override
	public String toString() {
		return "PolicyNotFoundException []";
	}
}
