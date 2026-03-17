package com.app.exception;

class Employee{
	static {
		System.out.println("Employee class loading....");
	}
}

public class Demo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.app.exception.Employee");
	}

}
