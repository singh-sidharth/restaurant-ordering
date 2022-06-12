package com.zephyr.service;

import java.util.List;

import com.zephyr.models.OrderDto;
import com.zephyr.models.Table;

public interface AdminService {
	
	public void userLogout(long userId);
	
	public List<Table> getTables();
	
	public OrderDto viewTableDetails(long orderId);
	
	public void updateUserCart(long cartId);

}
