package com.app.beans;

// spring bean class
public class Student {
	
	// bean properties
	private String name;
	private String email;
	
	public Student() {
		System.out.println("Zero param constructor is called");
	}
	
	public Student(String name, String email) {
		System.out.println("Parameterized constructor ");
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + "]";
	}
}
