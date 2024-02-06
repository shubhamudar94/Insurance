package com.hexaware.entity;

public class Client {
	private int clientId;
	private String clientName;
	private String contactInfo;
	private Policy policy;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public Client(int clientId, String clientName, String contactInfo, Policy policy) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.contactInfo = contactInfo;
		this.policy = policy;
	}

	// Getter methods
	public int getClientId() {
		return clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public Policy getPolicy() {
		return policy;
	}

	// Setter methods
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	// toString method
	@Override
	public String toString() {
		return "Client{" + "clientId=" + clientId + ", clientName='" + clientName + '\'' + ", contactInfo='"
				+ contactInfo + '\'' + ", policy=" + policy + '}';
	}

	public void printClientDetails() {
		System.out.println("Client Details:");
		System.out.println("ClientID: " + clientId);
		System.out.println("ClientName: " + clientName);
		System.out.println("ContactInfo: " + contactInfo);
		System.out.println("Policy: " + policy);
	}
}
