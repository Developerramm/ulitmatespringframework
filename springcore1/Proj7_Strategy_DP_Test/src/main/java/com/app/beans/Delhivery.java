package com.app.beans;

// dependent spring bean class 
public final class Delhivery implements LogisticsService {
	
	@Override
	public String checkDeliveryStatus(int orderId) {
		String status = "Your order id " + orderId + ""
				+ " is reached to the nearest hub . It will be deliverd "
				+ " by delhivery agent";
		return status;
	}

	@Override
	public String orderReturnRequest(int orderId) {
		String returnRequestStatus = "Your order is " + orderId + ""
				+ " A return request is accepted. It will be pick by delhivery agen today";
		return returnRequestStatus;
	}

	@Override
	public String orderReplaceRequest(int orderId) {
		String replaceStatus = "Your order is " + orderId + ""
				+ " A replace request is accepted. It will be pick by delhivery agen today";
		return replaceStatus;
	}

}
