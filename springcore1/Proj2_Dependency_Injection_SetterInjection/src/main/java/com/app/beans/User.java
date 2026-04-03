package com.app.beans;

// spring bean class 
public class User {
	
	// bean property
	private String name;
	private String email;
	private String pass;
	
	public User() {
		System.out.println("User.User()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void showUserInfo() {
//		String name = "Ram kumar";
//		String email = "ram@gmail.com";
//		String pass = "Ram@1234";
		
		System.out.println(name + " " + email + " " + pass);
	}

}
