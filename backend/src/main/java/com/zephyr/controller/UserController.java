package com.zephyr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.models.MenuDao;
import com.zephyr.models.OrderDao;
import com.zephyr.models.OrderDto;
import com.zephyr.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userSvc;
	
	@GetMapping("get_menu")
	public List<MenuDao> getMenu(){
		return this.userSvc.getMenu();
	}
	
	@PostMapping("place_order")
	public long placeOrder(OrderDto order) {
		return this.userSvc.placeOrder(order);
	}
	
//	@GetMapping("get_bill")
//	public OrderDto getBill(@RequestParam(required = true, name = "orderId")Long orderId) {
//		return new OrderDto();
//		}
	
}
