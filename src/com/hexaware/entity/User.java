package com.hexaware.entity;

public class User {
	private int userId;
	private String username;
	private String password;
	private String role;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, String password, String role) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	// Getter methods
	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	// Setter methods
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

	// toString method
	@Override
	public String toString() {
		return "User{" + "userId=" + userId + ", username='" + username + '\'' + ", password='" + password + '\''
				+ ", role='" + role + '\'' + '}';
	}

	public void printUserDetails() {
		System.out.println("User Details:");
		System.out.println("UserID: " + userId);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Role: " + role);

	}
}
