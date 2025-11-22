package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println(context);
		System.out.println("Ram kumar maniyari");
		
		User u = context.getBean("user",User.class);
		

		// this is manual object 
		User user = new User();
		user.showUser();
		
		// this is automatically created object 
		u.showUser();
		
	}

}
