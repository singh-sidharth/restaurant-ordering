package com.zephyr.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@Column(name="table_id", nullable = false)
	private String tableId;
	@Column(name="payment_status")
	private String paymentStatus;
	@OneToMany(mappedBy="order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CartDao> carts;
	
	public OrderDao() {}
	public OrderDao(Long id, String tableId, String paymentStatus) {
		this.orderId = id;
		this.tableId = tableId;
		this.paymentStatus = paymentStatus;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long id) {
		this.orderId = id;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "OrderDao [id=" + orderId + ", tableId=" + tableId + ", paymentStatus=" + paymentStatus + "]";
	}
	
}
