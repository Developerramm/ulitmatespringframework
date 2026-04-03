package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
	
		User user = null;
		user = (User)context.getBean("user");
		user.showUserInfo();
		
		((AbstractApplicationContext)context).close();
	}

}
