package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Ram kumar maniyari");
		
//		User user = new User();
//		user.showUser();
		
		ApplicationContext context = null;
		
		User user = null;
	
		context = new ClassPathXmlApplicationContext("config.xml");
		
		user = context.getBean("user",User.class);
		user.showUser();
		
		System.out.println(context.getClass().getName());
		
		
		((AbstractApplicationContext)context).close();
		
	}
}
