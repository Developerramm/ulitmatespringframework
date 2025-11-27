package com.app.beans;

// target class
public class Amazon {
	
	private LogisticsService logisticsService;
	
	public Amazon(LogisticsService logisticsService) {
		this.logisticsService = logisticsService;
	}
	
	public String checkDeliveryStatus(int orderId) {
		return logisticsService.checkDelivryStatus(orderId);
	}
	
	public void returnOrder(int orderId) {
		String returnOrderRequet = logisticsService.orderReturnRequest(orderId);
		System.out.println(returnOrderRequet);
	}
	
	public String replaceOrder(int orderId) {
		return logisticsService.orderReplaceRequest(orderId);
	}
	
	

}
