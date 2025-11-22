package com.app.beans;

public class User {

	public User() {
		System.out.println("User.User()");
	}
	
	public void showUserInfo() {
		String name = "Ram singh";
		String email = "ram@gmail.com";
		String pass = "1001";
		
		System.out.println(name + " " + email + " " + pass);
	}
}
