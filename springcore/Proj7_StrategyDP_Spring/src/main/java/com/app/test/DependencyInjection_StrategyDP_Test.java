package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class DependencyInjection_StrategyDP_Test {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Amazon amazon = null;
		amazon =  context.getBean("amazon",Amazon.class);
		
		String status =  amazon.checkDeliveryStatus(10006);
		System.out.println(status);
		
		amazon.returnOrder(10025);
		
		String replacaeStatus = amazon.replaceOrder(45879);
		System.out.println(replacaeStatus);
		
		
		
		((AbstractApplicationContext)context).close();
	}

}
