package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;
import com.app.beans.Student;

public class Setter_Dependency_Injection_Test {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = null;
		
		student = (Student)context.getBean("student");
		student.startMyCouser();
		
		Employee employee = null;
		employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
		
		
		((AbstractApplicationContext)context).close();
		
		System.out.println(context);
	}

}
