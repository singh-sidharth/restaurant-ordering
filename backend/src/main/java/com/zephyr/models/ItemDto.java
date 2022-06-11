package com.zephyr.models;

public class ItemDto {
	
	private int quantity;
	
	private long itemId;

	public int getCount() {
		return quantity;
	}

	public void setCount(int count) {
		quantity = count;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public ItemDto(int count, long itemId) {
		this.quantity= count;
		this.itemId = itemId;
	}
	
	

}
