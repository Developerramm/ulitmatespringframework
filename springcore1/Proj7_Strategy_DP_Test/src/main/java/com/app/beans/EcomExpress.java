package com.app.beans;

public final class EcomExpress implements LogisticsService{
	
	@Override
	public String checkDeliveryStatus(int orderId) {
		String status = "Your order id " + orderId + ""
				+ " is reached to the nearest hub . It will be deliverd "
				+ " by EcomExpress agent";
		return status;
	}

	@Override
	public String orderReturnRequest(int orderId) {
		String returnRequestStatus = "Your order is " + orderId + ""
				+ " A return request is accepted. It will be pick by EcomExpress agen today";
		return returnRequestStatus;
	}

	@Override
	public String orderReplaceRequest(int orderId) {
		String replaceStatus = "Your order is " + orderId + ""
				+ " A replace request is accepted. It will be pick by EcomExpress agen today";
		return replaceStatus;
	}

}
