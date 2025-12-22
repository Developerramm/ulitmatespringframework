package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class CollectionPropertiesInjectionTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		Employee employee = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
		
		
		
		((AbstractApplicationContext)context).close();
	}

}
