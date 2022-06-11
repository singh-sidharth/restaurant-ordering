package com.zephyr.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_tbl")
public class OrderDao {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="table_id", nullable = false)
	private String tableId;
	@Column(name="payment_status")
	private String paymentStatus;
	public OrderDao() {}
	public OrderDao(Long id, String tableId, String paymentStatus) {
		this.id = id;
		this.tableId = tableId;
		this.paymentStatus = paymentStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return "OrderDao [id=" + id + ", tableId=" + tableId + ", paymentStatus=" + paymentStatus + "]";
	}
	
}
