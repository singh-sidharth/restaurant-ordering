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
	private static final long serialVersionUID = -6170246598686074259L;
	@Id
	@GeneratedValue
	@Column(name="order_id")
	private Long orderId;
	private Long tableId;
	@Column(name="username", nullable = false)
	private String username;
	@Column(name="mobile_number", nullable=false)
	private String mobileNumber;
	@Column(name="payment_status")
	private String paymentStatus;
	@OneToMany
	private Set<CartDao> carts;
	
	public OrderDao() {}
	public OrderDao(Long id, Long tableId, String username, String paymentStatus) {
		this.orderId = id;
		this.username = username;
		this.paymentStatus = paymentStatus;
		this.tableId = tableId;
	}
	public Long getTableId() {
		return tableId;
	}
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long id) {
		this.orderId = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "OrderDao [id=" + orderId + ", tableId=" + tableId+", username="+username + ", paymentStatus=" + paymentStatus + "]";
	}
	
}
