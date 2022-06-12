package com.zephyr.models;

import java.util.List;

public class OrderDto {
	
	private long orderId;
	
	private List<ItemDto> cart;
	
	public OrderDto() {}

	public OrderDto(long orderId, List<ItemDto> cart) {
		super();
		this.orderId = orderId;
		this.cart = cart;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public List<ItemDto> getCart() {
		return cart;
	}

	public void setCart(List<ItemDto> cart) {
		this.cart = cart;
	}
	
	

	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", cart=" + cart + "]";
	}
	
	
	
	

}
