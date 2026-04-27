package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class Strategy_DP_Test {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Amazon amazon = null;
		amazon = context.getBean("amazon",Amazon.class);
		
		String status = amazon.checkDeliveryStatus(100001);
		System.out.println(status);
		
		System.out.println(amazon.replaceOrder(10001));
		System.out.println(amazon.replaceOrder(99999));
		
		
		((AbstractApplicationContext)context).close();
	}

}
