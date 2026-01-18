package com.app.beans;

public class Delhivary implements LogisticsService{

	@Override
	public void trackOrder(int orderId) {
		System.out.println("Your order with order id " + orderId + " is reached to the "
				+ "nearest hub. It will be delivered by Delhivary agent");
		
	}

}
