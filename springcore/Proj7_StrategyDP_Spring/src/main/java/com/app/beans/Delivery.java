package com.app.beans;

// dependent spring bean class 
public class Delivery implements LogisticsService{
	
	@Override
	public String checkDelivryStatus(int orderId) {
		// TODO Auto-generated method stub
		String status = "Your order id " + orderId + " is reached to the nearest hub"
				+ " It will be delivered by delhivery agent";
		return status;
	}

	@Override
	public String orderReturnRequest(int orderId) {
		// TODO Auto-generated method stub
		String returnRequestStatus = "Your order id " + orderId + " return request is accepted"
				+ " delhivery agent will pickup your item soon";
		return returnRequestStatus;
	}

	@Override
	public String orderReplaceRequest(int orderId) {
		String replaceStatus = "Your order id " + orderId + " replace status is accepted"
				+ " delhivery agent will pickup your item soon";
		return replaceStatus;
	}

}
