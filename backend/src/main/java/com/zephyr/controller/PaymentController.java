package com.zephyr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.models.BillDto;

@RestController
public class PaymentController {

	@GetMapping("get_bill")
	public BillDto getBill(@RequestParam(required = true, name = "orderId")Long orderId) {
		return new BillDto();
		}
}
