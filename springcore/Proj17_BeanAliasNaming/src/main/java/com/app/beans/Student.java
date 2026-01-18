package com.app.beans;

public class Student {
	
	private String name;
	
	public Student(String name) {
		System.out.println("Student.Student()");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
