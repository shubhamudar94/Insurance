package com.hexaware.entity;

public class Payment {
	private int paymentId;
	private String paymentDate;
	private double paymentAmount;
	private Client client;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, String paymentDate, double paymentAmount, Client client) {
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.client = client;
	}

	// Getter methods
	public int getPaymentId() {
		return paymentId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public Client getClient() {
		return client;
	}

	// Setter methods
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// toString method
	@Override
	public String toString() {
		return "Payment{" + "paymentId=" + paymentId + ", paymentDate='" + paymentDate + '\'' + ", paymentAmount="
				+ paymentAmount + ", client=" + client + '}';
	}

	public void printPaymentDetails() {
		System.out.println("Payment Details:");
		System.out.println("PaymentID: " + paymentId);
		System.out.println("PaymentDate: " + paymentDate);
		System.out.println("PaymentAmount: " + paymentAmount);
		System.out.println("Client: " + client);
	}

}
