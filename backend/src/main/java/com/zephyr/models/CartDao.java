package com.zephyr.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cart_tbl")
public class CartDao {
	
	@Id
	@GeneratedValue
	private Long id; 
	@Column(name="order_id")
	private String orderId;
	@Column(name="placed_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date placedAt;
	public CartDao(Long id, String orderId, Date placedAt) {
		this.id = id;
		this.orderId = orderId;
		this.placedAt = placedAt;
	}
public CartDao() {}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public Date getPlacedAt() {
	return placedAt;
}
public void setPlacedAt(Date placedAt) {
	this.placedAt = placedAt;
}
@Override
public String toString() {
	return "CartDao [id=" + id + ", orderId=" + orderId + ", placedAt=" + placedAt + "]";
}
}
