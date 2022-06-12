package com.zephyr.models;

import java.util.List;

public class OrderDto {
	
	private long orderId;
	private long tableId;
	private String userName;
	private String mobileNumber;
	
	private List<ItemDto> cart;
	
	public OrderDto() {}

	

	public OrderDto(long orderId, String userName, String mobileNumber, List<ItemDto> cart) {
		this.orderId = orderId;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.cart = cart;
	}



	public long getTableId() {
		return tableId;
	}



	public void setTableId(long tableId) {
		this.tableId = tableId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
		return "OrderDto [orderId=" + orderId + ", tableId=" + tableId + ", userName=" + userName + ", mobileNumber="
				+ mobileNumber + ", cart=" + cart + "]";
	}


	
}
