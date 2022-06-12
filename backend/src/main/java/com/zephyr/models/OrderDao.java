package com.zephyr.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_tbl")
public class OrderDao implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="order_id")
	private Long orderId;
	@Column(name="user_id", nullable = false)
	private Long userId;
	@Column(name="payment_status")
	private String paymentStatus;
	@OneToMany(mappedBy="order")
	private Set<CartDao> carts;
	
	public OrderDao() {}
	public OrderDao(Long id, Long tableId, String paymentStatus) {
		this.orderId = id;
		this.userId = tableId;
		this.paymentStatus = paymentStatus;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long id) {
		this.orderId = id;
	}
	public Long getTableId() {
		return userId;
	}
	public void setTableId(Long tableId) {
		this.userId = tableId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "OrderDao [id=" + orderId + ", tableId=" + userId + ", paymentStatus=" + paymentStatus + "]";
	}
	
}
