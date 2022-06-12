package com.zephyr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.models.OrderDto;
import com.zephyr.service.PaymentService;
import com.zephyr.service.UserService;

@RestController
public class PaymentController {
	
	@Autowired
	public PaymentService paymentSvc;
	
	@PostMapping("pay")
	public String settleBill(long orderId){
		return this.paymentSvc.settle(orderId);
		
	}
	
	
	
	
	

	
}
