package com.app.beans;

public class User {
	
	private String name;
	private String email;
	private String pass;

	public User() {
		System.out.println("User.User()");
	}
	public void showUserInfo() {
		System.out.println(name + " " + email + " " + pass);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
