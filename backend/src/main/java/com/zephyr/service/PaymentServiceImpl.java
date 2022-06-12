package com.zephyr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zephyr.repositories.OrderRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public String pay(long orderId) {
		return this.settle(orderId);
	}

	@Override
	public String settle(long orderId) {
		this.orderRepo.updatePaymentStatusByOrderId(orderId);
		return "done";
	}
	
}
