package com.zephyr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	public PaymentService paymentSvc;
	
	@PostMapping("pay")
	public String pay(long orderId){
		return this.paymentSvc.settle(orderId);
		
	}
	
	
	@PostMapping("settle_bill")
	public String settleBill(long orderId) {
		return this.paymentSvc.settle(orderId);
	}
	
}
