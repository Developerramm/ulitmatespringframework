package com.app.beans;

public class Bluedart implements LogisticsService{

	@Override
	public void trackOrder(int orderId) {
		System.out.println("Your order id" + orderId + " is reachced to the nearest hub. it will"
				+ " be delivered by bluedart");
		
		
	}

}
