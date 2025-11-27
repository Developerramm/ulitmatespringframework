package com.app.beans;

public interface LogisticsService {
	
	public String checkDelivryStatus(int orderId);
	
	public String orderReturnRequest(int orderId);
	
	public String orderReplaceRequest(int orderId);

}
