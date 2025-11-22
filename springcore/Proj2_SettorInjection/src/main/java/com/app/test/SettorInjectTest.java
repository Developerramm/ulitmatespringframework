package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class SettorInjectTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		User user = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println(context);
		
		user = context.getBean("user",User.class);
		user.showUserInfo();
		
		user = context.getBean("user1",User.class);
		user.showUserInfo();
		
		
		System.out.println("Ram kumar maniyari");
	}
	
}
