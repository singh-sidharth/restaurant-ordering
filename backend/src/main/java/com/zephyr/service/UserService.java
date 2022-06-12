package com.zephyr.service;

import java.util.List;

import com.zephyr.models.MenuDao;
import com.zephyr.models.OrderDto;


public interface UserService {
	
	public List<MenuDao> getMenu();
	
	public long placeOrder(OrderDto order);
	
	public OrderDto getBill(long orderId);
}