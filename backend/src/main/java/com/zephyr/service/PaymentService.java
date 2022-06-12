package com.zephyr.service;

public interface PaymentService {

	public String pay(long orderId);
	
	public String settle(long orderId);
	
}
