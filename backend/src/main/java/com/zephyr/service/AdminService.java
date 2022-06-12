package com.zephyr.service;

import com.zephyr.models.OrderDto;

public interface AdminService {
	
	public void userLogout(long userId);
	
	public String getTables();
	
	public OrderDto viewTableDetails(long orderId);
	
	public void updateUserCart(long cartId);

}
